/**
 * ReadTeilaufgabeSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien für das Lesen einer Teilaufgabe.
 */
public class ReadTeilaufgabeSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadTeilaufgabeSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadTeilaufgabeSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabeNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabeNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schlagworteFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schlagworteFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "schlagwort"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Nummer des Tickets, zu der die Teilaufgabe gehört. */
    private int ticketNr;
    /* Die Nummer der Teilaufgabe. */
    private String teilaufgabeNr;
    private String modifiedSince;
    private String[] schlagworteFilter;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadTeilaufgabeSearchCriteriaType() {
    }


    public ReadTeilaufgabeSearchCriteriaType(
            int ticketNr,
            String teilaufgabeNr,
            String modifiedSince,
            String[] schlagworteFilter) {
        this.ticketNr = ticketNr;
        this.teilaufgabeNr = teilaufgabeNr;
        this.modifiedSince = modifiedSince;
        this.schlagworteFilter = schlagworteFilter;
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
     * Gets the ticketNr value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @return ticketNr   * Die Nummer des Tickets, zu der die Teilaufgabe gehört.
     */
    public int getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @param ticketNr   * Die Nummer des Tickets, zu der die Teilaufgabe gehört.
     */
    public void setTicketNr(int ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the teilaufgabeNr value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @return teilaufgabeNr   * Die Nummer der Teilaufgabe.
     */
    public String getTeilaufgabeNr() {
        return teilaufgabeNr;
    }

    /**
     * Sets the teilaufgabeNr value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @param teilaufgabeNr   * Die Nummer der Teilaufgabe.
     */
    public void setTeilaufgabeNr(String teilaufgabeNr) {
        this.teilaufgabeNr = teilaufgabeNr;
    }

    /**
     * Gets the modifiedSince value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the schlagworteFilter value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @return schlagworteFilter
     */
    public String[] getSchlagworteFilter() {
        return schlagworteFilter;
    }

    /**
     * Sets the schlagworteFilter value for this ReadTeilaufgabeSearchCriteriaType.
     *
     * @param schlagworteFilter
     */
    public void setSchlagworteFilter(String[] schlagworteFilter) {
        this.schlagworteFilter = schlagworteFilter;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadTeilaufgabeSearchCriteriaType)) return false;
        ReadTeilaufgabeSearchCriteriaType other = (ReadTeilaufgabeSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.ticketNr == other.getTicketNr() &&
                ((this.teilaufgabeNr == null && other.getTeilaufgabeNr() == null) ||
                        (this.teilaufgabeNr != null &&
                                this.teilaufgabeNr.equals(other.getTeilaufgabeNr()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.schlagworteFilter == null && other.getSchlagworteFilter() == null) ||
                        (this.schlagworteFilter != null &&
                                java.util.Arrays.equals(this.schlagworteFilter, other.getSchlagworteFilter())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getTicketNr();
        if (getTeilaufgabeNr() != null) {
            _hashCode += getTeilaufgabeNr().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getSchlagworteFilter() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getSchlagworteFilter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSchlagworteFilter(), i);
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
