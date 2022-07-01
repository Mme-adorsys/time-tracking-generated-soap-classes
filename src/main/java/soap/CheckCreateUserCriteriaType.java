/**
 * CheckCreateUserCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Kriterien zur Prüfung der User-Anlage.
 */
public class CheckCreateUserCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CheckCreateUserCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CheckCreateUserCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vonDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vonDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stichtag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stichtag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* ob ab diesem Datum die Lizenz verletzt wird */
    private String vonDatum;
    /* ob bis zu diesem Datum die Lizenz verletzt wird */
    private String bisDatum;
    /* Datum für die Abfrage der Anzahl der noch verfügbaren Lizenzen */
    private String stichtag;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CheckCreateUserCriteriaType() {
    }


    public CheckCreateUserCriteriaType(
            String vonDatum,
            String bisDatum,
            String stichtag) {
        this.vonDatum = vonDatum;
        this.bisDatum = bisDatum;
        this.stichtag = stichtag;
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
     * Gets the vonDatum value for this CheckCreateUserCriteriaType.
     *
     * @return vonDatum   * ob ab diesem Datum die Lizenz verletzt wird
     */
    public String getVonDatum() {
        return vonDatum;
    }

    /**
     * Sets the vonDatum value for this CheckCreateUserCriteriaType.
     *
     * @param vonDatum   * ob ab diesem Datum die Lizenz verletzt wird
     */
    public void setVonDatum(String vonDatum) {
        this.vonDatum = vonDatum;
    }

    /**
     * Gets the bisDatum value for this CheckCreateUserCriteriaType.
     *
     * @return bisDatum   * ob bis zu diesem Datum die Lizenz verletzt wird
     */
    public String getBisDatum() {
        return bisDatum;
    }

    /**
     * Sets the bisDatum value for this CheckCreateUserCriteriaType.
     *
     * @param bisDatum   * ob bis zu diesem Datum die Lizenz verletzt wird
     */
    public void setBisDatum(String bisDatum) {
        this.bisDatum = bisDatum;
    }

    /**
     * Gets the stichtag value for this CheckCreateUserCriteriaType.
     *
     * @return stichtag   * Datum für die Abfrage der Anzahl der noch verfügbaren Lizenzen
     */
    public String getStichtag() {
        return stichtag;
    }

    /**
     * Sets the stichtag value for this CheckCreateUserCriteriaType.
     *
     * @param stichtag   * Datum für die Abfrage der Anzahl der noch verfügbaren Lizenzen
     */
    public void setStichtag(String stichtag) {
        this.stichtag = stichtag;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckCreateUserCriteriaType)) return false;
        CheckCreateUserCriteriaType other = (CheckCreateUserCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.vonDatum == null && other.getVonDatum() == null) ||
                        (this.vonDatum != null &&
                                this.vonDatum.equals(other.getVonDatum()))) &&
                ((this.bisDatum == null && other.getBisDatum() == null) ||
                        (this.bisDatum != null &&
                                this.bisDatum.equals(other.getBisDatum()))) &&
                ((this.stichtag == null && other.getStichtag() == null) ||
                        (this.stichtag != null &&
                                this.stichtag.equals(other.getStichtag())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getVonDatum() != null) {
            _hashCode += getVonDatum().hashCode();
        }
        if (getBisDatum() != null) {
            _hashCode += getBisDatum().hashCode();
        }
        if (getStichtag() != null) {
            _hashCode += getStichtag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
