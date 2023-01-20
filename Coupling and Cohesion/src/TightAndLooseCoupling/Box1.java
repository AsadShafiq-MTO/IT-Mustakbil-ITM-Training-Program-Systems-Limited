package TightAndLooseCoupling;

final class Box1 {

	public int volume;
    public Box1(int length, int width, int height) 
    {
        this.volume = length * width * height;
    }
    public int getVolume() 
    {
       return volume ;
    }
}
