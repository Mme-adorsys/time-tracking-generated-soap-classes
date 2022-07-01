/**
 * ReadSchlagworteResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Das Resultat der Request-Ausführung.
 */
public class ReadSchlagworteResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadSchlagworteResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadSchlagworteResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schlagworteListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagworteListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "SchlagwortType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "schlagwort"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der gefundenen Schlagworte. */
    private SchlagwortType[] schlagworteListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadSchlagworteResponseType() {
    }


    public ReadSchlagworteResponseType(
            ResponseHeaderType responseHeader,
            SchlagwortType[] schlagworteListe) {
        this.responseHeader = responseHeader;
        this.schlagworteListe = schlagworteListe;
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
     * Gets the responseHeader value for this ReadSchlagworteResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this ReadSchlagworteResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the schlagworteListe value for this ReadSchlagworteResponseType.
     *
     * @return schlagworteListe   * Die Liste der gefundenen Schlagworte.
     */
    public SchlagwortType[] getSchlagworteListe() {
        return schlagworteListe;
    }

    /**
     * Sets the schlagworteListe value for this ReadSchlagworteResponseType.
     *
     * @param schlagworteListe   * Die Liste der gefundenen Schlagworte.
     */
    public void setSchlagworteListe(SchlagwortType[] schlagworteListe) {
        this.schlagworteListe = schlagworteListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadSchlagworteResponseType)) return false;
        ReadSchlagworteResponseType other = (ReadSchlagworteResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.responseHeader == null && other.getResponseHeader() == null) ||
                        (this.responseHeader != null &&
                                this.responseHeader.equals(other.getResponseHeader()))) &&
                ((this.schlagworteListe == null && other.getSchlagworteListe() == null) ||
                        (this.schlagworteListe != null &&
                                java.util.Arrays.equals(this.schlagworteListe, other.getSchlagworteListe())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        if (getSchlagworteListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSchlagworteListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSchlagworteListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
