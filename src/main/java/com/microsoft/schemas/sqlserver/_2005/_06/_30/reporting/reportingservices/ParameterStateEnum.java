
package com.microsoft.schemas.sqlserver._2005._06._30.reporting.reportingservices;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ParameterStateEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ParameterStateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HasValidValue"/&gt;
 *     &lt;enumeration value="MissingValidValue"/&gt;
 *     &lt;enumeration value="HasOutstandingDependencies"/&gt;
 *     &lt;enumeration value="DynamicValuesUnavailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParameterStateEnum")
@XmlEnum
public enum ParameterStateEnum {

    @XmlEnumValue("HasValidValue")
    HAS_VALID_VALUE("HasValidValue"),
    @XmlEnumValue("MissingValidValue")
    MISSING_VALID_VALUE("MissingValidValue"),
    @XmlEnumValue("HasOutstandingDependencies")
    HAS_OUTSTANDING_DEPENDENCIES("HasOutstandingDependencies"),
    @XmlEnumValue("DynamicValuesUnavailable")
    DYNAMIC_VALUES_UNAVAILABLE("DynamicValuesUnavailable");
    private final String value;

    ParameterStateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParameterStateEnum fromValue(String v) {
        for (ParameterStateEnum c: ParameterStateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
