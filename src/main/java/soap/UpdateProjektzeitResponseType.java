/**
 * UpdateProjektzeitResponseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Antwort bei der Aktualisierung einer Zeitbuchung.
 */
public class UpdateProjektzeitResponseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(UpdateProjektzeitResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "UpdateProjektzeitResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ResponseHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Response-Header. */
    private ResponseHeaderType responseHeader;
    /* Die Liste der id der aktualisierte Projektzeit und ids der
     * eventuell durch Splitung angelegte Projektzeiten, durch Komma getrennt. */
    private String ids;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public UpdateProjektzeitResponseType() {
    }


    public UpdateProjektzeitResponseType(
            ResponseHeaderType responseHeader,
            String ids) {
        this.responseHeader = responseHeader;
        this.ids = ids;
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
     * Gets the responseHeader value for this UpdateProjektzeitResponseType.
     *
     * @return responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public ResponseHeaderType getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the responseHeader value for this UpdateProjektzeitResponseType.
     *
     * @param responseHeader   * Der allgemeine ZEP Response-Header.
     */
    public void setResponseHeader(ResponseHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    /**
     * Gets the ids value for this UpdateProjektzeitResponseType.
     *
     * @return ids   * Die Liste der id der aktualisierte Projektzeit und ids der
     * eventuell durch Splitung angelegte Projektzeiten, durch Komma getrennt.
     */
    public String getIds() {
        return ids;
    }

    /**
     * Sets the ids value for this UpdateProjektzeitResponseType.
     *
     * @param ids   * Die Liste der id der aktualisierte Projektzeit und ids der
     * eventuell durch Splitung angelegte Projektzeiten, durch Komma getrennt.
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateProjektzeitResponseType)) return false;
        UpdateProjektzeitResponseType other = (UpdateProjektzeitResponseType) obj;
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
                ((this.ids == null && other.getIds() == null) ||
                        (this.ids != null &&
                                this.ids.equals(other.getIds())));
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
        if (getIds() != null) {
            _hashCode += getIds().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
