package interface_Shape;

public class Shape implements InterfaceShape{
    private String nameFigure;
    @Override
    public void nameFigure()
    {
        System.out.println("Shape");
    }

    public void nameFigure(String nameFigure)
    {
        this.nameFigure = nameFigure;
        System.out.println(this.nameFigure);
    }
}
