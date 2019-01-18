package Train;

//import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

//@XmlAccessorType( XmlAccessType.NONE )
//@XmlJavaTypeAdapter(ChildObject.ParentAdapter.class)

@XmlJavaTypeAdapter(Locomotive.ParentAdapter.class)
public interface Component {
	public String getName();
}
