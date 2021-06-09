import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class CocktailService {

    public static String serializeXML(Cocktail coctail) {
        XStream xStream = new XStream(new StaxDriver());
        return xStream.toXML(coctail);
    }

    public static Cocktail deserializeXML(String xml) {
        XStream xStream = new XStream(new StaxDriver());
        xStream.addPermission(AnyTypePermission.ANY);
        return (Cocktail) xStream.fromXML(xml);
    }
}
