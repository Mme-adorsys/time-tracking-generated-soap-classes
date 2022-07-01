/**
 * ReadFehlzeitSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zur Abfrage von Fehlzeiten.
 */
public class ReadFehlzeitSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadFehlzeitSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadFehlzeitSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enddatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enddatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fehlgrund");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fehlgrund"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vonZeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vonZeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bisZeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bisZeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genehmigungspflichtig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genehmigungspflichtig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("genehmigt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genehmigt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Der Benutzer, dessen Fehlzeiten abgefragt werden sollen. */
    private String userId;
    /* Das (Anfangs-)Datum, an dem die Fehlzeiten liegen sollen. */
    private String startdatum;
    /* Das (Ende-)Datum, vor dem die Fehlzeiten liegen sollen. */
    private String enddatum;
    /* Der Fehlgrund, zu dem Fehlzeiten abgefragt werden sollen. */
    private String fehlgrund;
    private String vonZeit;
    private String bisZeit;
    /* Einschränkung nch der Genehmigung der abgefragten Fehlzeiten
     * - false oder 0 = nur nicht genehmigungspflichtig - true oder 1 = nur
     * genehmigungspflichtig - nicht angegeben = alle */
    private Boolean genehmigungspflichtig;
    private String modifiedSince;
    private Boolean genehmigt;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadFehlzeitSearchCriteriaType() {
    }


    public ReadFehlzeitSearchCriteriaType(
            String userId,
            String startdatum,
            String enddatum,
            String fehlgrund,
            String vonZeit,
            String bisZeit,
            Boolean genehmigungspflichtig,
            String modifiedSince,
            Boolean genehmigt) {
        this.userId = userId;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
        this.fehlgrund = fehlgrund;
        this.vonZeit = vonZeit;
        this.bisZeit = bisZeit;
        this.genehmigungspflichtig = genehmigungspflichtig;
        this.modifiedSince = modifiedSince;
        this.genehmigt = genehmigt;
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
     * Gets the userId value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return userId   * Der Benutzer, dessen Fehlzeiten abgefragt werden sollen.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param userId   * Der Benutzer, dessen Fehlzeiten abgefragt werden sollen.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the startdatum value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return startdatum   * Das (Anfangs-)Datum, an dem die Fehlzeiten liegen sollen.
     */
    public String getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the startdatum value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param startdatum   * Das (Anfangs-)Datum, an dem die Fehlzeiten liegen sollen.
     */
    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    /**
     * Gets the enddatum value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return enddatum   * Das (Ende-)Datum, vor dem die Fehlzeiten liegen sollen.
     */
    public String getEnddatum() {
        return enddatum;
    }

    /**
     * Sets the enddatum value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param enddatum   * Das (Ende-)Datum, vor dem die Fehlzeiten liegen sollen.
     */
    public void setEnddatum(String enddatum) {
        this.enddatum = enddatum;
    }

    /**
     * Gets the fehlgrund value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return fehlgrund   * Der Fehlgrund, zu dem Fehlzeiten abgefragt werden sollen.
     */
    public String getFehlgrund() {
        return fehlgrund;
    }

    /**
     * Sets the fehlgrund value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param fehlgrund   * Der Fehlgrund, zu dem Fehlzeiten abgefragt werden sollen.
     */
    public void setFehlgrund(String fehlgrund) {
        this.fehlgrund = fehlgrund;
    }

    /**
     * Gets the vonZeit value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return vonZeit
     */
    public String getVonZeit() {
        return vonZeit;
    }

    /**
     * Sets the vonZeit value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param vonZeit
     */
    public void setVonZeit(String vonZeit) {
        this.vonZeit = vonZeit;
    }

    /**
     * Gets the bisZeit value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return bisZeit
     */
    public String getBisZeit() {
        return bisZeit;
    }

    /**
     * Sets the bisZeit value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param bisZeit
     */
    public void setBisZeit(String bisZeit) {
        this.bisZeit = bisZeit;
    }

    /**
     * Gets the genehmigungspflichtig value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return genehmigungspflichtig   * Einschränkung nch der Genehmigung der abgefragten Fehlzeiten
     * - false oder 0 = nur nicht genehmigungspflichtig - true oder 1 = nur
     * genehmigungspflichtig - nicht angegeben = alle
     */
    public Boolean getGenehmigungspflichtig() {
        return genehmigungspflichtig;
    }

    /**
     * Sets the genehmigungspflichtig value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param genehmigungspflichtig   * Einschränkung nch der Genehmigung der abgefragten Fehlzeiten
     * - false oder 0 = nur nicht genehmigungspflichtig - true oder 1 = nur
     * genehmigungspflichtig - nicht angegeben = alle
     */
    public void setGenehmigungspflichtig(Boolean genehmigungspflichtig) {
        this.genehmigungspflichtig = genehmigungspflichtig;
    }

    /**
     * Gets the modifiedSince value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the genehmigt value for this ReadFehlzeitSearchCriteriaType.
     *
     * @return genehmigt
     */
    public Boolean getGenehmigt() {
        return genehmigt;
    }

    /**
     * Sets the genehmigt value for this ReadFehlzeitSearchCriteriaType.
     *
     * @param genehmigt
     */
    public void setGenehmigt(Boolean genehmigt) {
        this.genehmigt = genehmigt;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadFehlzeitSearchCriteriaType)) return false;
        ReadFehlzeitSearchCriteriaType other = (ReadFehlzeitSearchCriteriaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.startdatum == null && other.getStartdatum() == null) ||
                        (this.startdatum != null &&
                                this.startdatum.equals(other.getStartdatum()))) &&
                ((this.enddatum == null && other.getEnddatum() == null) ||
                        (this.enddatum != null &&
                                this.enddatum.equals(other.getEnddatum()))) &&
                ((this.fehlgrund == null && other.getFehlgrund() == null) ||
                        (this.fehlgrund != null &&
                                this.fehlgrund.equals(other.getFehlgrund()))) &&
                ((this.vonZeit == null && other.getVonZeit() == null) ||
                        (this.vonZeit != null &&
                                this.vonZeit.equals(other.getVonZeit()))) &&
                ((this.bisZeit == null && other.getBisZeit() == null) ||
                        (this.bisZeit != null &&
                                this.bisZeit.equals(other.getBisZeit()))) &&
                ((this.genehmigungspflichtig == null && other.getGenehmigungspflichtig() == null) ||
                        (this.genehmigungspflichtig != null &&
                                this.genehmigungspflichtig.equals(other.getGenehmigungspflichtig()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.genehmigt == null && other.getGenehmigt() == null) ||
                        (this.genehmigt != null &&
                                this.genehmigt.equals(other.getGenehmigt())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getStartdatum() != null) {
            _hashCode += getStartdatum().hashCode();
        }
        if (getEnddatum() != null) {
            _hashCode += getEnddatum().hashCode();
        }
        if (getFehlgrund() != null) {
            _hashCode += getFehlgrund().hashCode();
        }
        if (getVonZeit() != null) {
            _hashCode += getVonZeit().hashCode();
        }
        if (getBisZeit() != null) {
            _hashCode += getBisZeit().hashCode();
        }
        if (getGenehmigungspflichtig() != null) {
            _hashCode += getGenehmigungspflichtig().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getGenehmigt() != null) {
            _hashCode += getGenehmigt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
