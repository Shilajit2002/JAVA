package Exception;

class MathException extends RuntimeException {
    public MathException(String msg) {
        super(msg);
    }
}

class OverFlowException extends MathException {
    public OverFlowException(String msg) {
        super(msg);
    }
}

class UnderFlowException extends MathException {
    public UnderFlowException(String msg) {
        super(msg);
    }
}