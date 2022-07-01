/**
 * ReadMahlzeitSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zum Lesen von Mahlzeiten.
 */
public class ReadMahlzeitSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadMahlzeitSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadMahlzeitSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisDatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private Integer id;
    private String userId;
    /* Hat datum Wert und bisDatum überhaupt nicht vorhanden dann
     * bisDatum = datum. Hat datum Wert und bisDatum vorhanden (auch leer)
     * gilt datum als Startdatum. Hat datum kein Wert oder nicht Vorhanden
     * gilt als unendlich in der Vergangenheit. */
    private String datum;
    /* Ist bisDatum vorhanden und leer dann gilt als unendlich. Ist
     * bisDatum nicht vorhanden dann bisDatum = datum. */
    private String bisDatum;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadMahlzeitSearchCriteriaType() {
    }


    public ReadMahlzeitSearchCriteriaType(
            Integer id,
            String userId,
            String datum,
            String bisDatum) {
        this.id = id;
        this.userId = userId;
        this.datum = datum;
        this.bisDatum = bisDatum;
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
     * Gets the id value for this ReadMahlzeitSearchCriteriaType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ReadMahlzeitSearchCriteriaType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this ReadMahlzeitSearchCriteriaType.
     *
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ReadMahlzeitSearchCriteriaType.
     *
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the datum value for this ReadMahlzeitSearchCriteriaType.
     *
     * @return datum   * Hat datum Wert und bisDatum überhaupt nicht vorhanden dann
     * bisDatum = datum. Hat datum Wert und bisDatum vorhanden (auch leer)
     * gilt datum als Startdatum. Hat datum kein Wert oder nicht Vorhanden
     * gilt als unendlich in der Vergangenheit.
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this ReadMahlzeitSearchCriteriaType.
     *
     * @param datum   * Hat datum Wert und bisDatum überhaupt nicht vorhanden dann
     * bisDatum = datum. Hat datum Wert und bisDatum vorhanden (auch leer)
     * gilt datum als Startdatum. Hat datum kein Wert oder nicht Vorhanden
     * gilt als unendlich in der Vergangenheit.
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the bisDatum value for this ReadMahlzeitSearchCriteriaType.
     *
     * @return bisDatum   * Ist bisDatum vorhanden und leer dann gilt als unendlich. Ist
     * bisDatum nicht vorhanden dann bisDatum = datum.
     */
    public String getBisDatum() {
        return bisDatum;
    }

    /**
     * Sets the bisDatum value for this ReadMahlzeitSearchCriteriaType.
     *
     * @param bisDatum   * Ist bisDatum vorhanden und leer dann gilt als unendlich. Ist
     * bisDatum nicht vorhanden dann bisDatum = datum.
     */
    public void setBisDatum(String bisDatum) {
        this.bisDatum = bisDatum;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadMahlzeitSearchCriteriaType)) return false;
        ReadMahlzeitSearchCriteriaType other = (ReadMahlzeitSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.bisDatum == null && other.getBisDatum() == null) ||
                        (this.bisDatum != null &&
                                this.bisDatum.equals(other.getBisDatum())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getBisDatum() != null) {
            _hashCode += getBisDatum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
