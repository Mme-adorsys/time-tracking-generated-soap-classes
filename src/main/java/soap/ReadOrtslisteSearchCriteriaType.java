/**
 * ReadOrtslisteSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadOrtslisteSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadOrtslisteSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadOrtslisteSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* liefert Ortsliste, welche an diesem Datum gueltig ist */
    private String datum;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public ReadOrtslisteSearchCriteriaType() {
    }

    public ReadOrtslisteSearchCriteriaType(
            String datum) {
        this.datum = datum;
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
     * Gets the datum value for this ReadOrtslisteSearchCriteriaType.
     *
     * @return datum   * liefert Ortsliste, welche an diesem Datum gueltig ist
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this ReadOrtslisteSearchCriteriaType.
     *
     * @param datum   * liefert Ortsliste, welche an diesem Datum gueltig ist
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadOrtslisteSearchCriteriaType)) return false;
        ReadOrtslisteSearchCriteriaType other = (ReadOrtslisteSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
