/**
 * ReadProjektzeitenSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Suchkriterien für die Suche von Projektzeiten.
 */
public class ReadProjektzeitenSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadProjektzeitenSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadProjektzeitenSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("von");
        elemField.setXmlName(new javax.xml.namespace.QName("", "von"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("userIdListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userIdListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "String32"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "userId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedSince");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedSince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fakturierbar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fakturierbar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "attribute"));
        typeDesc.addFieldDesc(elemField);
    }

    private Integer id;
    /* Das Datum, ab dem Projektzeiten
     *                 				geliefert werden sollen. Falls keine
     *                 				anderen Suchkriterien spezifiziert
     *                 				werden müssen von und bis angegeben
     *                 				werden. Format: JJJJ-MM-TT */
    private String von;
    /* Das Datum, bis zu dem Projektzeiten
     *                 				geliefert werden sollen. Falls keine
     *                 				anderen Suchkriterien spezifiziert
     *                 				werden müssen von und bis angegeben
     *                 				werden. Format: JJJJ-MM-TT */
    private String bis;
    /* Liste der Projekt-Nummern der zu
     *                 				berücksichtigenden Projekte. */
    private String[] projektNrListe;
    /* Liste der Benutzernamen. */
    private String[] userIdListe;
    private String modifiedSince;
    private Integer projektId;
    /* 2=fakturierbare, 1=nicht fakturierbare, 0 oder leer = alle */
    private Integer fakturierbar;
    /* Liste von Attributen für
     *                 				kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadProjektzeitenSearchCriteriaType() {
    }


    public ReadProjektzeitenSearchCriteriaType(
            Integer id,
            String von,
            String bis,
            String[] projektNrListe,
            String[] userIdListe,
            String modifiedSince,
            Integer projektId,
            Integer fakturierbar,
            AttributeType[] attributes) {
        this.id = id;
        this.von = von;
        this.bis = bis;
        this.projektNrListe = projektNrListe;
        this.userIdListe = userIdListe;
        this.modifiedSince = modifiedSince;
        this.projektId = projektId;
        this.fakturierbar = fakturierbar;
        this.attributes = attributes;
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
     * Gets the id value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the von value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return von   * Das Datum, ab dem Projektzeiten
     *                 				geliefert werden sollen. Falls keine
     *                 				anderen Suchkriterien spezifiziert
     *                 				werden müssen von und bis angegeben
     *                 				werden. Format: JJJJ-MM-TT
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param von   * Das Datum, ab dem Projektzeiten
     *                 				geliefert werden sollen. Falls keine
     *                 				anderen Suchkriterien spezifiziert
     *                 				werden müssen von und bis angegeben
     *                 				werden. Format: JJJJ-MM-TT
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return bis   * Das Datum, bis zu dem Projektzeiten
     *                 				geliefert werden sollen. Falls keine
     *                 				anderen Suchkriterien spezifiziert
     *                 				werden müssen von und bis angegeben
     *                 				werden. Format: JJJJ-MM-TT
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param bis   * Das Datum, bis zu dem Projektzeiten
     *                 				geliefert werden sollen. Falls keine
     *                 				anderen Suchkriterien spezifiziert
     *                 				werden müssen von und bis angegeben
     *                 				werden. Format: JJJJ-MM-TT
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the projektNrListe value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return projektNrListe   * Liste der Projekt-Nummern der zu
     *                 				berücksichtigenden Projekte.
     */
    public String[] getProjektNrListe() {
        return projektNrListe;
    }

    /**
     * Sets the projektNrListe value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param projektNrListe   * Liste der Projekt-Nummern der zu
     *                 				berücksichtigenden Projekte.
     */
    public void setProjektNrListe(String[] projektNrListe) {
        this.projektNrListe = projektNrListe;
    }

    /**
     * Gets the userIdListe value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return userIdListe   * Liste der Benutzernamen.
     */
    public String[] getUserIdListe() {
        return userIdListe;
    }

    /**
     * Sets the userIdListe value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param userIdListe   * Liste der Benutzernamen.
     */
    public void setUserIdListe(String[] userIdListe) {
        this.userIdListe = userIdListe;
    }

    /**
     * Gets the modifiedSince value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return modifiedSince
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param modifiedSince
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the projektId value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return projektId
     */
    public Integer getProjektId() {
        return projektId;
    }

    /**
     * Sets the projektId value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param projektId
     */
    public void setProjektId(Integer projektId) {
        this.projektId = projektId;
    }

    /**
     * Gets the fakturierbar value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return fakturierbar   * 2=fakturierbare, 1=nicht fakturierbare, 0 oder leer = alle
     */
    public Integer getFakturierbar() {
        return fakturierbar;
    }

    /**
     * Sets the fakturierbar value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param fakturierbar   * 2=fakturierbare, 1=nicht fakturierbare, 0 oder leer = alle
     */
    public void setFakturierbar(Integer fakturierbar) {
        this.fakturierbar = fakturierbar;
    }

    /**
     * Gets the attributes value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @return attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ReadProjektzeitenSearchCriteriaType.
     *
     * @param attributes   * Liste von Attributen für
     *                 				kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadProjektzeitenSearchCriteriaType)) return false;
        ReadProjektzeitenSearchCriteriaType other = (ReadProjektzeitenSearchCriteriaType) obj;
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
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.projektNrListe == null && other.getProjektNrListe() == null) ||
                        (this.projektNrListe != null &&
                                java.util.Arrays.equals(this.projektNrListe, other.getProjektNrListe()))) &&
                ((this.userIdListe == null && other.getUserIdListe() == null) ||
                        (this.userIdListe != null &&
                                java.util.Arrays.equals(this.userIdListe, other.getUserIdListe()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.projektId == null && other.getProjektId() == null) ||
                        (this.projektId != null &&
                                this.projektId.equals(other.getProjektId()))) &&
                ((this.fakturierbar == null && other.getFakturierbar() == null) ||
                        (this.fakturierbar != null &&
                                this.fakturierbar.equals(other.getFakturierbar()))) &&
                ((this.attributes == null && other.getAttributes() == null) ||
                        (this.attributes != null &&
                                java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
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
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getProjektId() != null) {
            _hashCode += getProjektId().hashCode();
        }
        if (getFakturierbar() != null) {
            _hashCode += getFakturierbar().hashCode();
        }
        if (getAttributes() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
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
