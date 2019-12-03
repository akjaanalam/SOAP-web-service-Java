
package mypack1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dig1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dig2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addition", propOrder = {
    "dig1",
    "dig2"
})
public class Addition {

    protected int dig1;
    protected int dig2;

    /**
     * Gets the value of the dig1 property.
     * 
     */
    public int getDig1() {
        return dig1;
    }

    /**
     * Sets the value of the dig1 property.
     * 
     */
    public void setDig1(int value) {
        this.dig1 = value;
    }

    /**
     * Gets the value of the dig2 property.
     * 
     */
    public int getDig2() {
        return dig2;
    }

    /**
     * Sets the value of the dig2 property.
     * 
     */
    public void setDig2(int value) {
        this.dig2 = value;
    }

}
