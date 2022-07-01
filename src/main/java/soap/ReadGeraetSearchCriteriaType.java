/**
 * ReadGeraetSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class ReadGeraetSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadGeraetSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadGeraetSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suchbegriff");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suchbegriff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Mögliche Eingaben sind: App oder Terminal oder Leer */
    private String typ;
    private String status;
    /* Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle
     * nach:
     * Userid, Mitarbeitername, Mitarbeitervorname, Gerätname
     * eingeschränkt. */
    private String suchbegriff;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadGeraetSearchCriteriaType() {
    }


    public ReadGeraetSearchCriteriaType(
            String typ,
            String status,
            String suchbegriff) {
        this.typ = typ;
        this.status = status;
        this.suchbegriff = suchbegriff;
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
     * Gets the typ value for this ReadGeraetSearchCriteriaType.
     *
     * @return typ   * Mögliche Eingaben sind: App oder Terminal oder Leer
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the typ value for this ReadGeraetSearchCriteriaType.
     *
     * @param typ   * Mögliche Eingaben sind: App oder Terminal oder Leer
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * Gets the status value for this ReadGeraetSearchCriteriaType.
     *
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status value for this ReadGeraetSearchCriteriaType.
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the suchbegriff value for this ReadGeraetSearchCriteriaType.
     *
     * @return suchbegriff   * Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle
     * nach:
     * Userid, Mitarbeitername, Mitarbeitervorname, Gerätname
     * eingeschränkt.
     */
    public String getSuchbegriff() {
        return suchbegriff;
    }

    /**
     * Sets the suchbegriff value for this ReadGeraetSearchCriteriaType.
     *
     * @param suchbegriff   * Durch den in das Suchfeld eingebebenen Text wird die Ergebnistabelle
     * nach:
     * Userid, Mitarbeitername, Mitarbeitervorname, Gerätname
     * eingeschränkt.
     */
    public void setSuchbegriff(String suchbegriff) {
        this.suchbegriff = suchbegriff;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadGeraetSearchCriteriaType)) return false;
        ReadGeraetSearchCriteriaType other = (ReadGeraetSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.typ == null && other.getTyp() == null) ||
                        (this.typ != null &&
                                this.typ.equals(other.getTyp()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.suchbegriff == null && other.getSuchbegriff() == null) ||
                        (this.suchbegriff != null &&
                                this.suchbegriff.equals(other.getSuchbegriff())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTyp() != null) {
            _hashCode += getTyp().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSuchbegriff() != null) {
            _hashCode += getSuchbegriff().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
