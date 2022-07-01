/**
 * WoechentlichType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class WoechentlichType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(WoechentlichType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "WoechentlichType"));
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
        elemField.setFieldName("alleBestimmteWochen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alleBestimmteWochen"));
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
    }

    /* Endet nach x Ereignisse. */
    private Integer endetNach;
    /* Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide). */
    private String bis;
    private Integer alleBestimmteWochen;
    /* 1=Montag,..,7=Sonntag */
    private Integer wochentag;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public WoechentlichType() {
    }


    public WoechentlichType(
            Integer endetNach,
            String bis,
            Integer alleBestimmteWochen,
            Integer wochentag) {
        this.endetNach = endetNach;
        this.bis = bis;
        this.alleBestimmteWochen = alleBestimmteWochen;
        this.wochentag = wochentag;
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
     * Gets the endetNach value for this WoechentlichType.
     *
     * @return endetNach   * Endet nach x Ereignisse.
     */
    public Integer getEndetNach() {
        return endetNach;
    }

    /**
     * Sets the endetNach value for this WoechentlichType.
     *
     * @param endetNach   * Endet nach x Ereignisse.
     */
    public void setEndetNach(Integer endetNach) {
        this.endetNach = endetNach;
    }

    /**
     * Gets the bis value for this WoechentlichType.
     *
     * @return bis   * Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide).
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this WoechentlichType.
     *
     * @param bis   * Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide).
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the alleBestimmteWochen value for this WoechentlichType.
     *
     * @return alleBestimmteWochen
     */
    public Integer getAlleBestimmteWochen() {
        return alleBestimmteWochen;
    }

    /**
     * Sets the alleBestimmteWochen value for this WoechentlichType.
     *
     * @param alleBestimmteWochen
     */
    public void setAlleBestimmteWochen(Integer alleBestimmteWochen) {
        this.alleBestimmteWochen = alleBestimmteWochen;
    }

    /**
     * Gets the wochentag value for this WoechentlichType.
     *
     * @return wochentag   * 1=Montag,..,7=Sonntag
     */
    public Integer getWochentag() {
        return wochentag;
    }

    /**
     * Sets the wochentag value for this WoechentlichType.
     *
     * @param wochentag   * 1=Montag,..,7=Sonntag
     */
    public void setWochentag(Integer wochentag) {
        this.wochentag = wochentag;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WoechentlichType)) return false;
        WoechentlichType other = (WoechentlichType) obj;
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
                ((this.alleBestimmteWochen == null && other.getAlleBestimmteWochen() == null) ||
                        (this.alleBestimmteWochen != null &&
                                this.alleBestimmteWochen.equals(other.getAlleBestimmteWochen()))) &&
                ((this.wochentag == null && other.getWochentag() == null) ||
                        (this.wochentag != null &&
                                this.wochentag.equals(other.getWochentag())));
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
        if (getAlleBestimmteWochen() != null) {
            _hashCode += getAlleBestimmteWochen().hashCode();
        }
        if (getWochentag() != null) {
            _hashCode += getWochentag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
