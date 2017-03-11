/**
 * Created by Ciprian on 03/10/17.
 */
public class Street {
    Integer id;
    String name;
    public Street(Integer id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public Integer getId()
    {
        return this.id;
    }

    public  String getName()
    {
        return this.name;
    }
}
