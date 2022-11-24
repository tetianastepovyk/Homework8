package interface_Shape;

public class Triangle extends Shape{
    private String nameFigure;
    @Override
    public void nameFigure(String nameFigure)
    {
        this.nameFigure = nameFigure;
        System.out.println(this.nameFigure);
    }
}
