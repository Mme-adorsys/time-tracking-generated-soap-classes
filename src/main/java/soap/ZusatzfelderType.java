/**
 * ZusatzfelderType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Definition von Kunden- oder Projektzusatzfeldern und Rechnungstext.
 */
public class ZusatzfelderType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ZusatzfelderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ZusatzfelderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feld1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feld1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feld2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feld2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feld3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feld3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feld4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feld4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feld5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feld5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungstextOben");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungstextOben"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungstextUnten");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungstextUnten"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Bezeichnung des Zusatzfeldes. */
    private String feld1;
    /* Der Wert des Zusatzfeldes. */
    private String value1;
    /* Die Bezeichnung des Zusatzfeldes. */
    private String feld2;
    /* Der Wert des Zusatzfeldes. */
    private String value2;
    /* Die Bezeichnung des Zusatzfeldes. */
    private String feld3;
    /* Der Wert des Zusatzfeldes. */
    private String value3;
    /* Die Bezeichnung des Zusatzfeldes. */
    private String feld4;
    /* Der Wert des Zusatzfeldes. */
    private String value4;
    /* Die Bezeichnung des Zusatzfeldes. */
    private String feld5;
    /* Der Wert des Zusatzfeldes. */
    private String value5;
    /* Der obere Rechnungstext. */
    private String rechnungstextOben;
    /* Der untere Rechnungstext. Darf nur
     *                 				Kundenzusatzfelder gefuellt werden. */
    private String rechnungstextUnten;
    /* Aktion. Um die Zusatzfelder im Rahmen eines Updates zu löschen
     * muss hier 'delete' angegeben werden. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ZusatzfelderType() {
    }


    public ZusatzfelderType(
            String feld1,
            String value1,
            String feld2,
            String value2,
            String feld3,
            String value3,
            String feld4,
            String value4,
            String feld5,
            String value5,
            String rechnungstextOben,
            String rechnungstextUnten,
            String action) {
        this.feld1 = feld1;
        this.value1 = value1;
        this.feld2 = feld2;
        this.value2 = value2;
        this.feld3 = feld3;
        this.value3 = value3;
        this.feld4 = feld4;
        this.value4 = value4;
        this.feld5 = feld5;
        this.value5 = value5;
        this.rechnungstextOben = rechnungstextOben;
        this.rechnungstextUnten = rechnungstextUnten;
        this.action = action;
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Gets the feld1 value for this ZusatzfelderType.
     *
     * @return feld1   * Die Bezeichnung des Zusatzfeldes.
     */
    public String getFeld1() {
        return feld1;
    }

    /**
     * Sets the feld1 value for this ZusatzfelderType.
     *
     * @param feld1   * Die Bezeichnung des Zusatzfeldes.
     */
    public void setFeld1(String feld1) {
        this.feld1 = feld1;
    }

    /**
     * Gets the value1 value for this ZusatzfelderType.
     *
     * @return value1   * Der Wert des Zusatzfeldes.
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Sets the value1 value for this ZusatzfelderType.
     *
     * @param value1   * Der Wert des Zusatzfeldes.
     */
    public void setValue1(String value1) {
        this.value1 = value1;
    }

    /**
     * Gets the feld2 value for this ZusatzfelderType.
     *
     * @return feld2   * Die Bezeichnung des Zusatzfeldes.
     */
    public String getFeld2() {
        return feld2;
    }

    /**
     * Sets the feld2 value for this ZusatzfelderType.
     *
     * @param feld2   * Die Bezeichnung des Zusatzfeldes.
     */
    public void setFeld2(String feld2) {
        this.feld2 = feld2;
    }

    /**
     * Gets the value2 value for this ZusatzfelderType.
     *
     * @return value2   * Der Wert des Zusatzfeldes.
     */
    public String getValue2() {
        return value2;
    }

    /**
     * Sets the value2 value for this ZusatzfelderType.
     *
     * @param value2   * Der Wert des Zusatzfeldes.
     */
    public void setValue2(String value2) {
        this.value2 = value2;
    }

    /**
     * Gets the feld3 value for this ZusatzfelderType.
     *
     * @return feld3   * Die Bezeichnung des Zusatzfeldes.
     */
    public String getFeld3() {
        return feld3;
    }

    /**
     * Sets the feld3 value for this ZusatzfelderType.
     *
     * @param feld3   * Die Bezeichnung des Zusatzfeldes.
     */
    public void setFeld3(String feld3) {
        this.feld3 = feld3;
    }

    /**
     * Gets the value3 value for this ZusatzfelderType.
     *
     * @return value3   * Der Wert des Zusatzfeldes.
     */
    public String getValue3() {
        return value3;
    }

    /**
     * Sets the value3 value for this ZusatzfelderType.
     *
     * @param value3   * Der Wert des Zusatzfeldes.
     */
    public void setValue3(String value3) {
        this.value3 = value3;
    }

    /**
     * Gets the feld4 value for this ZusatzfelderType.
     *
     * @return feld4   * Die Bezeichnung des Zusatzfeldes.
     */
    public String getFeld4() {
        return feld4;
    }

    /**
     * Sets the feld4 value for this ZusatzfelderType.
     *
     * @param feld4   * Die Bezeichnung des Zusatzfeldes.
     */
    public void setFeld4(String feld4) {
        this.feld4 = feld4;
    }

    /**
     * Gets the value4 value for this ZusatzfelderType.
     *
     * @return value4   * Der Wert des Zusatzfeldes.
     */
    public String getValue4() {
        return value4;
    }

    /**
     * Sets the value4 value for this ZusatzfelderType.
     *
     * @param value4   * Der Wert des Zusatzfeldes.
     */
    public void setValue4(String value4) {
        this.value4 = value4;
    }

    /**
     * Gets the feld5 value for this ZusatzfelderType.
     *
     * @return feld5   * Die Bezeichnung des Zusatzfeldes.
     */
    public String getFeld5() {
        return feld5;
    }

    /**
     * Sets the feld5 value for this ZusatzfelderType.
     *
     * @param feld5   * Die Bezeichnung des Zusatzfeldes.
     */
    public void setFeld5(String feld5) {
        this.feld5 = feld5;
    }

    /**
     * Gets the value5 value for this ZusatzfelderType.
     *
     * @return value5   * Der Wert des Zusatzfeldes.
     */
    public String getValue5() {
        return value5;
    }

    /**
     * Sets the value5 value for this ZusatzfelderType.
     *
     * @param value5   * Der Wert des Zusatzfeldes.
     */
    public void setValue5(String value5) {
        this.value5 = value5;
    }

    /**
     * Gets the rechnungstextOben value for this ZusatzfelderType.
     *
     * @return rechnungstextOben   * Der obere Rechnungstext.
     */
    public String getRechnungstextOben() {
        return rechnungstextOben;
    }

    /**
     * Sets the rechnungstextOben value for this ZusatzfelderType.
     *
     * @param rechnungstextOben   * Der obere Rechnungstext.
     */
    public void setRechnungstextOben(String rechnungstextOben) {
        this.rechnungstextOben = rechnungstextOben;
    }

    /**
     * Gets the rechnungstextUnten value for this ZusatzfelderType.
     *
     * @return rechnungstextUnten   * Der untere Rechnungstext. Darf nur
     *                 				Kundenzusatzfelder gefuellt werden.
     */
    public String getRechnungstextUnten() {
        return rechnungstextUnten;
    }

    /**
     * Sets the rechnungstextUnten value for this ZusatzfelderType.
     *
     * @param rechnungstextUnten   * Der untere Rechnungstext. Darf nur
     *                 				Kundenzusatzfelder gefuellt werden.
     */
    public void setRechnungstextUnten(String rechnungstextUnten) {
        this.rechnungstextUnten = rechnungstextUnten;
    }

    /**
     * Gets the action value for this ZusatzfelderType.
     *
     * @return action   * Aktion. Um die Zusatzfelder im Rahmen eines Updates zu löschen
     * muss hier 'delete' angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this ZusatzfelderType.
     *
     * @param action   * Aktion. Um die Zusatzfelder im Rahmen eines Updates zu löschen
     * muss hier 'delete' angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ZusatzfelderType)) return false;
        ZusatzfelderType other = (ZusatzfelderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.feld1 == null && other.getFeld1() == null) ||
                        (this.feld1 != null &&
                                this.feld1.equals(other.getFeld1()))) &&
                ((this.value1 == null && other.getValue1() == null) ||
                        (this.value1 != null &&
                                this.value1.equals(other.getValue1()))) &&
                ((this.feld2 == null && other.getFeld2() == null) ||
                        (this.feld2 != null &&
                                this.feld2.equals(other.getFeld2()))) &&
                ((this.value2 == null && other.getValue2() == null) ||
                        (this.value2 != null &&
                                this.value2.equals(other.getValue2()))) &&
                ((this.feld3 == null && other.getFeld3() == null) ||
                        (this.feld3 != null &&
                                this.feld3.equals(other.getFeld3()))) &&
                ((this.value3 == null && other.getValue3() == null) ||
                        (this.value3 != null &&
                                this.value3.equals(other.getValue3()))) &&
                ((this.feld4 == null && other.getFeld4() == null) ||
                        (this.feld4 != null &&
                                this.feld4.equals(other.getFeld4()))) &&
                ((this.value4 == null && other.getValue4() == null) ||
                        (this.value4 != null &&
                                this.value4.equals(other.getValue4()))) &&
                ((this.feld5 == null && other.getFeld5() == null) ||
                        (this.feld5 != null &&
                                this.feld5.equals(other.getFeld5()))) &&
                ((this.value5 == null && other.getValue5() == null) ||
                        (this.value5 != null &&
                                this.value5.equals(other.getValue5()))) &&
                ((this.rechnungstextOben == null && other.getRechnungstextOben() == null) ||
                        (this.rechnungstextOben != null &&
                                this.rechnungstextOben.equals(other.getRechnungstextOben()))) &&
                ((this.rechnungstextUnten == null && other.getRechnungstextUnten() == null) ||
                        (this.rechnungstextUnten != null &&
                                this.rechnungstextUnten.equals(other.getRechnungstextUnten()))) &&
                ((this.action == null && other.getAction() == null) ||
                        (this.action != null &&
                                this.action.equals(other.getAction())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFeld1() != null) {
            _hashCode += getFeld1().hashCode();
        }
        if (getValue1() != null) {
            _hashCode += getValue1().hashCode();
        }
        if (getFeld2() != null) {
            _hashCode += getFeld2().hashCode();
        }
        if (getValue2() != null) {
            _hashCode += getValue2().hashCode();
        }
        if (getFeld3() != null) {
            _hashCode += getFeld3().hashCode();
        }
        if (getValue3() != null) {
            _hashCode += getValue3().hashCode();
        }
        if (getFeld4() != null) {
            _hashCode += getFeld4().hashCode();
        }
        if (getValue4() != null) {
            _hashCode += getValue4().hashCode();
        }
        if (getFeld5() != null) {
            _hashCode += getFeld5().hashCode();
        }
        if (getValue5() != null) {
            _hashCode += getValue5().hashCode();
        }
        if (getRechnungstextOben() != null) {
            _hashCode += getRechnungstextOben().hashCode();
        }
        if (getRechnungstextUnten() != null) {
            _hashCode += getRechnungstextUnten().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
