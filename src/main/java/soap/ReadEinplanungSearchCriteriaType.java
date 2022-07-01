/**
 * ReadEinplanungSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Suchkriterien zur Abfrage von Einplanungen.
 */
public class ReadEinplanungSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadEinplanungSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadEinplanungSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vonDatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vonDatum"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIdListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIdListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "userId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNrListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNrListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String64"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "projektNr"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String vonDatum;
    private String bisDatum;
    private String[] userIdListe;
    private String[] projektNrListe;
    private Integer projektId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadEinplanungSearchCriteriaType() {
    }


    public ReadEinplanungSearchCriteriaType(
            String vonDatum,
            String bisDatum,
            String[] userIdListe,
            String[] projektNrListe,
            Integer projektId) {
        this.vonDatum = vonDatum;
        this.bisDatum = bisDatum;
        this.userIdListe = userIdListe;
        this.projektNrListe = projektNrListe;
        this.projektId = projektId;
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
     * Gets the vonDatum value for this ReadEinplanungSearchCriteriaType.
     *
     * @return vonDatum
     */
    public String getVonDatum() {
        return vonDatum;
    }

    /**
     * Sets the vonDatum value for this ReadEinplanungSearchCriteriaType.
     *
     * @param vonDatum
     */
    public void setVonDatum(String vonDatum) {
        this.vonDatum = vonDatum;
    }

    /**
     * Gets the bisDatum value for this ReadEinplanungSearchCriteriaType.
     *
     * @return bisDatum
     */
    public String getBisDatum() {
        return bisDatum;
    }

    /**
     * Sets the bisDatum value for this ReadEinplanungSearchCriteriaType.
     *
     * @param bisDatum
     */
    public void setBisDatum(String bisDatum) {
        this.bisDatum = bisDatum;
    }

    /**
     * Gets the userIdListe value for this ReadEinplanungSearchCriteriaType.
     *
     * @return userIdListe
     */
    public String[] getUserIdListe() {
        return userIdListe;
    }

    /**
     * Sets the userIdListe value for this ReadEinplanungSearchCriteriaType.
     *
     * @param userIdListe
     */
    public void setUserIdListe(String[] userIdListe) {
        this.userIdListe = userIdListe;
    }

    /**
     * Gets the projektNrListe value for this ReadEinplanungSearchCriteriaType.
     *
     * @return projektNrListe
     */
    public String[] getProjektNrListe() {
        return projektNrListe;
    }

    /**
     * Sets the projektNrListe value for this ReadEinplanungSearchCriteriaType.
     *
     * @param projektNrListe
     */
    public void setProjektNrListe(String[] projektNrListe) {
        this.projektNrListe = projektNrListe;
    }

    /**
     * Gets the projektId value for this ReadEinplanungSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ReadEinplanungSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadEinplanungSearchCriteriaType)) return false;
        ReadEinplanungSearchCriteriaType other = (ReadEinplanungSearchCriteriaType) obj;
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
                ((this.userIdListe == null && other.getUserIdListe() == null) ||
                        (this.userIdListe != null &&
                                java.util.Arrays.equals(this.userIdListe, other.getUserIdListe()))) &&
                ((this.projektNrListe == null && other.getProjektNrListe() == null) ||
                        (this.projektNrListe != null &&
                                java.util.Arrays.equals(this.projektNrListe, other.getProjektNrListe()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId())));
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
        if (getUserIdListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getUserIdListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUserIdListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjektNrListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjektNrListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjektNrListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
