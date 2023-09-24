import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CurrencyConverterApp extends JFrame {
    private JComboBox<String> baseCurrencyCombo, targetCurrencyCombo;
    private JTextField amountField;
    private JTextArea resultArea;

    private static final String API_KEY = "YOUR_API_KEY"; // Replace with your API key
    private static final String API_URL = "https://open.er-api.com/v6/latest/";

    public CurrencyConverterApp() {
        setTitle("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        String[] currencies = {"USD", "EUR", "GBP", "JPY", "CAD"}; // List of common currencies

        baseCurrencyCombo = new JComboBox<>(currencies);
        targetCurrencyCombo = new JComboBox<>(currencies);
        amountField = new JTextField(10);
        resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Base Currency:"));
        inputPanel.add(baseCurrencyCombo);
        inputPanel.add(new JLabel("Target Currency:"));
        inputPanel.add(targetCurrencyCombo);
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(convertButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
    }

    private void convertCurrency() {
        String baseCurrency = (String) baseCurrencyCombo.getSelectedItem();
        String targetCurrency = (String) targetCurrencyCombo.getSelectedItem();
        double amount;

        try {
            amount = Double.parseDouble(amountField.getText());
        } catch (NumberFormatException ex) {
            resultArea.setText("Please enter a valid amount.");
            return;
        }

        String apiUrl = API_URL + baseCurrency;

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JSONObject json = new JSONObject(response.toString());
            JSONObject rates = json.getJSONObject("rates");
            double exchangeRate = rates.getDouble(targetCurrency);

            double convertedAmount = amount * exchangeRate;

            resultArea.setText(String.format("%.2f %s is %.2f %s",
                    amount, baseCurrency, convertedAmount, targetCurrency));
        } catch (Exception e) {
            resultArea.setText("Error fetching exchange rates.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CurrencyConverterApp app = new CurrencyConverterApp();
            app.setVisible(true);
        });
    }
}
