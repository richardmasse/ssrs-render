
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SortDirectionEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SortDirectionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Ascending"/&gt;
 *     &lt;enumeration value="Descending"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SortDirectionEnum")
@XmlEnum
public enum SortDirectionEnum {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Ascending")
    ASCENDING("Ascending"),
    @XmlEnumValue("Descending")
    DESCENDING("Descending");
    private final String value;

    SortDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortDirectionEnum fromValue(String v) {
        for (SortDirectionEnum c: SortDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
