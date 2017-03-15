
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PageCountMode.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PageCountMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="Estimate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PageCountMode")
@XmlEnum
public enum PageCountMode {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Estimate")
    ESTIMATE("Estimate");
    private final String value;

    PageCountMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PageCountMode fromValue(String v) {
        for (PageCountMode c: PageCountMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
