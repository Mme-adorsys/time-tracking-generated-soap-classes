/**
 * TaeglichType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class TaeglichType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TaeglichType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TaeglichType"));
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
        elemField.setFieldName("alleBestimmteTage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alleBestimmteTage"));
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
    private Integer alleBestimmteTage;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TaeglichType() {
    }


    public TaeglichType(
            Integer endetNach,
            String bis,
            Integer alleBestimmteTage) {
        this.endetNach = endetNach;
        this.bis = bis;
        this.alleBestimmteTage = alleBestimmteTage;
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
     * Gets the endetNach value for this TaeglichType.
     *
     * @return endetNach   * Endet nach x Ereignisse.
     */
    public Integer getEndetNach() {
        return endetNach;
    }

    /**
     * Sets the endetNach value for this TaeglichType.
     *
     * @param endetNach   * Endet nach x Ereignisse.
     */
    public void setEndetNach(Integer endetNach) {
        this.endetNach = endetNach;
    }

    /**
     * Gets the bis value for this TaeglichType.
     *
     * @return bis   * Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide).
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this TaeglichType.
     *
     * @param bis   * Gilt bis diesem Datum. Entweder 'endetNach' oder 'bis' eingeben
     * (nicht beide).
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the alleBestimmteTage value for this TaeglichType.
     *
     * @return alleBestimmteTage
     */
    public Integer getAlleBestimmteTage() {
        return alleBestimmteTage;
    }

    /**
     * Sets the alleBestimmteTage value for this TaeglichType.
     *
     * @param alleBestimmteTage
     */
    public void setAlleBestimmteTage(Integer alleBestimmteTage) {
        this.alleBestimmteTage = alleBestimmteTage;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaeglichType)) return false;
        TaeglichType other = (TaeglichType) obj;
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
                ((this.alleBestimmteTage == null && other.getAlleBestimmteTage() == null) ||
                        (this.alleBestimmteTage != null &&
                                this.alleBestimmteTage.equals(other.getAlleBestimmteTage())));
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
        if (getAlleBestimmteTage() != null) {
            _hashCode += getAlleBestimmteTage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
