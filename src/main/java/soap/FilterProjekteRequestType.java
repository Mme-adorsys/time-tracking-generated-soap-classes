/**
 * FilterProjekteRequestType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Paramater zum Filtern von Projekten.
 */
public class FilterProjekteRequestType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FilterProjekteRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FilterProjekteRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "RequestHeaderType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterProjekteSearchCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterProjekteSearchCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FilterProjekteSearchCriteriaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private RequestHeaderType requestHeader;
    private FilterProjekteSearchCriteriaType filterProjekteSearchCriteria;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public FilterProjekteRequestType() {
    }


    public FilterProjekteRequestType(
            RequestHeaderType requestHeader,
            FilterProjekteSearchCriteriaType filterProjekteSearchCriteria) {
        this.requestHeader = requestHeader;
        this.filterProjekteSearchCriteria = filterProjekteSearchCriteria;
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
     * Gets the requestHeader value for this FilterProjekteRequestType.
     *
     * @return requestHeader
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the requestHeader value for this FilterProjekteRequestType.
     *
     * @param requestHeader
     */
    public void setRequestHeader(RequestHeaderType requestHeader) {
        this.requestHeader = requestHeader;
    }

    /**
     * Gets the filterProjekteSearchCriteria value for this FilterProjekteRequestType.
     *
     * @return filterProjekteSearchCriteria
     */
    public FilterProjekteSearchCriteriaType getFilterProjekteSearchCriteria() {
        return filterProjekteSearchCriteria;
    }

    /**
     * Sets the filterProjekteSearchCriteria value for this FilterProjekteRequestType.
     *
     * @param filterProjekteSearchCriteria
     */
    public void setFilterProjekteSearchCriteria(FilterProjekteSearchCriteriaType filterProjekteSearchCriteria) {
        this.filterProjekteSearchCriteria = filterProjekteSearchCriteria;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FilterProjekteRequestType)) return false;
        FilterProjekteRequestType other = (FilterProjekteRequestType) obj;
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
                ((this.filterProjekteSearchCriteria == null && other.getFilterProjekteSearchCriteria() == null) ||
                        (this.filterProjekteSearchCriteria != null &&
                                this.filterProjekteSearchCriteria.equals(other.getFilterProjekteSearchCriteria())));
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
        if (getFilterProjekteSearchCriteria() != null) {
            _hashCode += getFilterProjekteSearchCriteria().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
