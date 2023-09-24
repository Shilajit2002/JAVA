package Practice;

interface TvRemote {
    void Remote();
}

interface SmartTvRemote extends TvRemote{
    @Override
    void Remote();
}

class Tv implements TvRemote{
    @Override
    public void Remote() {
        System.out.println("Remote Working");
    }
}

class Screen{
    public static void main(String[] args) {
        Tv T = new Tv();
        T.Remote();
    }
}