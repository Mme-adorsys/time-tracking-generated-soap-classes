/**
 * ReadKategorieRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Parameter zur Abfrage von Kategorien.
 */
public class ReadKategorieRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadKategorieRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKategorieRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kategorieArt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorieArt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readKategorieSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readKategorieSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadKategorieSearchCriteriaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der allgemeine ZEP Request-Header. */
    private RequestHeaderType requestHeader;
    /* kategorieArt muss ein Wert haben (Klein oder Groß geschrieben):
     * mitarbeiter, projekt, kunde, ansprechpartner, angebot, ticket oder
     * dokument */
    private String kategorieArt;
    private ReadKategorieSearchCriteriaType readKategorieSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadKategorieRequestType() {
    }


    public ReadKategorieRequestType(
            RequestHeaderType requestHeader,
            String kategorieArt,
            ReadKategorieSearchCriteriaType readKategorieSearchCriteria) {
        this.requestHeader = requestHeader;
        this.kategorieArt = kategorieArt;
        this.readKategorieSearchCriteria = readKategorieSearchCriteria;
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
     * Gets the requestHeader value for this ReadKategorieRequestType.
     *
     * @return requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this ReadKategorieRequestType.
     *
     * @param requestHeader   * Der allgemeine ZEP Request-Header.
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the kategorieArt value for this ReadKategorieRequestType.
     *
     * @return kategorieArt   * kategorieArt muss ein Wert haben (Klein oder Groß geschrieben):
     * mitarbeiter, projekt, kunde, ansprechpartner, angebot, ticket oder
     * dokument
     */
    public String getKategorieArt() {
        return kategorieArt;
    }

    /**
     * Sets the kategorieArt value for this ReadKategorieRequestType.
     *
     * @param kategorieArt   * kategorieArt muss ein Wert haben (Klein oder Groß geschrieben):
     * mitarbeiter, projekt, kunde, ansprechpartner, angebot, ticket oder
     * dokument
     */
    public void setKategorieArt(String kategorieArt) {
        this.kategorieArt = kategorieArt;
    }

    /**
     * Gets the readKategorieSearchCriteria value for this ReadKategorieRequestType.
     *
     * @return readKategorieSearchCriteria
     */
    public ReadKategorieSearchCriteriaType getReadKategorieSearchCriteria() {
        return readKategorieSearchCriteria;
    }

    /**
     * Sets the readKategorieSearchCriteria value for this ReadKategorieRequestType.
     *
     * @param readKategorieSearchCriteria
     */
    public void setReadKategorieSearchCriteria(ReadKategorieSearchCriteriaType readKategorieSearchCriteria) {
        this.readKategorieSearchCriteria = readKategorieSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadKategorieRequestType)) return false;
        ReadKategorieRequestType other = (ReadKategorieRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.requestHeader == null && other.getRequestHeader() == null) ||
                        (this.requestHeader != null &&
                                this.requestHeader.equals(other.getRequestHeader()))) &&
                ((this.kategorieArt == null && other.getKategorieArt() == null) ||
                        (this.kategorieArt != null &&
                                this.kategorieArt.equals(other.getKategorieArt()))) &&
                ((this.readKategorieSearchCriteria == null && other.getReadKategorieSearchCriteria() == null) ||
                        (this.readKategorieSearchCriteria != null &&
                                this.readKategorieSearchCriteria.equals(other.getReadKategorieSearchCriteria())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getRequestHeader() != null) {
            _hashCode += getRequestHeader().hashCode();
        }
        if (getKategorieArt() != null) {
            _hashCode += getKategorieArt().hashCode();
        }
        if (getReadKategorieSearchCriteria() != null) {
            _hashCode += getReadKategorieSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
