/**
 * CheckCreateUserRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Prüft, ob die Anlage weiterer Benutzer möglich wäre.
 */
public class CheckCreateUserRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CheckCreateUserRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CheckCreateUserRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkCreateUserCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "checkCreateUserCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "CheckCreateUserCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private CheckCreateUserCriteriaType checkCreateUserCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public CheckCreateUserRequestType() {
    }


    public CheckCreateUserRequestType(
            RequestHeaderType requestHeader,
            CheckCreateUserCriteriaType checkCreateUserCriteria) {
        this.requestHeader = requestHeader;
        this.checkCreateUserCriteria = checkCreateUserCriteria;
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
     * Gets the requestHeader value for this CheckCreateUserRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this CheckCreateUserRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the checkCreateUserCriteria value for this CheckCreateUserRequestType.
     *
     * @return checkCreateUserCriteria
     */
    public CheckCreateUserCriteriaType getCheckCreateUserCriteria() {
        return checkCreateUserCriteria;
    }

    /**
     * Sets the checkCreateUserCriteria value for this CheckCreateUserRequestType.
     *
     * @param checkCreateUserCriteria
     */
    public void setCheckCreateUserCriteria(CheckCreateUserCriteriaType checkCreateUserCriteria) {
        this.checkCreateUserCriteria = checkCreateUserCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CheckCreateUserRequestType)) return false;
        CheckCreateUserRequestType other = (CheckCreateUserRequestType) obj;
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
                ((this.checkCreateUserCriteria == null && other.getCheckCreateUserCriteria() == null) ||
                        (this.checkCreateUserCriteria != null &&
                                this.checkCreateUserCriteria.equals(other.getCheckCreateUserCriteria())));
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
        if (getCheckCreateUserCriteria() != null) {
            _hashCode += getCheckCreateUserCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
