/**
 * JaehrlichType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class JaehrlichType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(JaehrlichType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "JaehrlichType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endetNach");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endetNach"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alleBestimmteJahre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alleBestimmteJahre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monatstag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monatstag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wochentag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wochentag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monatswoche");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monatswoche"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Endet nach x Ereignisse. */
    private Integer endetNach;
    /* Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide). */
    private String bis;
    private Integer alleBestimmteJahre;
    private Integer monat;
    /* 1,...,28(,29,30,31) */
    private Integer monatstag;
    /* 1=Montag,..,7=Sonntag */
    private Integer wochentag;
    /* 1=die Erste;
     * 2=die Zweite;
     * 3=die Dritte;
     * 4=die Vierte;
     * 5= die Letzte. */
    private Integer monatswoche;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public JaehrlichType() {
    }


    public JaehrlichType(
            Integer endetNach,
            String bis,
            Integer alleBestimmteJahre,
            Integer monat,
            Integer monatstag,
            Integer wochentag,
            Integer monatswoche) {
        this.endetNach = endetNach;
        this.bis = bis;
        this.alleBestimmteJahre = alleBestimmteJahre;
        this.monat = monat;
        this.monatstag = monatstag;
        this.wochentag = wochentag;
        this.monatswoche = monatswoche;
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
     * Gets the endetNach value for this JaehrlichType.
     *
     * @return endetNach   * Endet nach x Ereignisse.
     */
    public Integer getEndetNach() {
        return endetNach;
    }

    /**
     * Sets the endetNach value for this JaehrlichType.
     *
     * @param endetNach   * Endet nach x Ereignisse.
     */
    public void setEndetNach(Integer endetNach) {
        this.endetNach = endetNach;
    }

    /**
     * Gets the bis value for this JaehrlichType.
     *
     * @return bis   * Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide).
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this JaehrlichType.
     *
     * @param bis   * Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide).
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the alleBestimmteJahre value for this JaehrlichType.
     *
     * @return alleBestimmteJahre
     */
    public Integer getAlleBestimmteJahre() {
        return alleBestimmteJahre;
    }

    /**
     * Sets the alleBestimmteJahre value for this JaehrlichType.
     *
     * @param alleBestimmteJahre
     */
    public void setAlleBestimmteJahre(Integer alleBestimmteJahre) {
        this.alleBestimmteJahre = alleBestimmteJahre;
    }

    /**
     * Gets the monat value for this JaehrlichType.
     *
     * @return monat
     */
    public Integer getMonat() {
        return monat;
    }

    /**
     * Sets the monat value for this JaehrlichType.
     *
     * @param monat
     */
    public void setMonat(Integer monat) {
        this.monat = monat;
    }

    /**
     * Gets the monatstag value for this JaehrlichType.
     *
     * @return monatstag   * 1,...,28(,29,30,31)
     */
    public Integer getMonatstag() {
        return monatstag;
    }

    /**
     * Sets the monatstag value for this JaehrlichType.
     *
     * @param monatstag   * 1,...,28(,29,30,31)
     */
    public void setMonatstag(Integer monatstag) {
        this.monatstag = monatstag;
    }

    /**
     * Gets the wochentag value for this JaehrlichType.
     *
     * @return wochentag   * 1=Montag,..,7=Sonntag
     */
    public Integer getWochentag() {
        return wochentag;
    }

    /**
     * Sets the wochentag value for this JaehrlichType.
     *
     * @param wochentag   * 1=Montag,..,7=Sonntag
     */
    public void setWochentag(Integer wochentag) {
        this.wochentag = wochentag;
    }

    /**
     * Gets the monatswoche value for this JaehrlichType.
     *
     * @return monatswoche   * 1=die Erste;
     * 2=die Zweite;
     * 3=die Dritte;
     * 4=die Vierte;
     * 5= die Letzte.
     */
    public Integer getMonatswoche() {
        return monatswoche;
    }

    /**
     * Sets the monatswoche value for this JaehrlichType.
     *
     * @param monatswoche   * 1=die Erste;
     * 2=die Zweite;
     * 3=die Dritte;
     * 4=die Vierte;
     * 5= die Letzte.
     */
    public void setMonatswoche(Integer monatswoche) {
        this.monatswoche = monatswoche;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof JaehrlichType)) return false;
        JaehrlichType other = (JaehrlichType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.endetNach == null && other.getEndetNach() == null) ||
                        (this.endetNach != null &&
                                this.endetNach.equals(other.getEndetNach()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.alleBestimmteJahre == null && other.getAlleBestimmteJahre() == null) ||
                        (this.alleBestimmteJahre != null &&
                                this.alleBestimmteJahre.equals(other.getAlleBestimmteJahre()))) &&
                ((this.monat == null && other.getMonat() == null) ||
                        (this.monat != null &&
                                this.monat.equals(other.getMonat()))) &&
                ((this.monatstag == null && other.getMonatstag() == null) ||
                        (this.monatstag != null &&
                                this.monatstag.equals(other.getMonatstag()))) &&
                ((this.wochentag == null && other.getWochentag() == null) ||
                        (this.wochentag != null &&
                                this.wochentag.equals(other.getWochentag()))) &&
                ((this.monatswoche == null && other.getMonatswoche() == null) ||
                        (this.monatswoche != null &&
                                this.monatswoche.equals(other.getMonatswoche())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getEndetNach() != null) {
            _hashCode += getEndetNach().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getAlleBestimmteJahre() != null) {
            _hashCode += getAlleBestimmteJahre().hashCode();
        }
        if (getMonat() != null) {
            _hashCode += getMonat().hashCode();
        }
        if (getMonatstag() != null) {
            _hashCode += getMonatstag().hashCode();
        }
        if (getWochentag() != null) {
            _hashCode += getWochentag().hashCode();
        }
        if (getMonatswoche() != null) {
            _hashCode += getMonatswoche().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
