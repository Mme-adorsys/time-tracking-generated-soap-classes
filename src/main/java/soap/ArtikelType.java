/**
 * ArtikelType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Daten eines Artikels.
 */
public class ArtikelType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ArtikelType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ArtikelType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artikelnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artikelnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bezeichnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einheit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "einheit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einzelpreis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "einzelpreis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("waehrung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "waehrung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beschreibung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beschreibung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inaktiv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inaktiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("neueArtikelnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "neueArtikelnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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

    /* Die Nummer des Artikels. */
    private String artikelnummer;
    /* Die Bezeichnung des Artikels. */
    private String bezeichnung;
    /* Die Einheit des Artikels. */
    private String einheit;
    /* Der Einzelpreis des Artikels. */
    private Double einzelpreis;
    /* Die Währung des Artikels. */
    private String waehrung;
    /* Die Beschreibung des Artikels. */
    private String beschreibung;
    /* Flagge, ob der Artikel aktiv oder inaktiv ist. */
    private Boolean inaktiv;
    /* Das Anlagedatum des Artikels. */
    private String created;
    /* Das Datum der letzten Aktualisierung des Artikels. */
    private String modified;
    /* Neue Nummer der Artikels (bei Update der Artikelnummer). */
    private String neueArtikelnummer;
    private Integer id;
    /* Liste von Attributen für kundenspezifische Erweiterungen. */
    private AttributeType[] attributes;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ArtikelType() {
    }


    public ArtikelType(
            String artikelnummer,
            String bezeichnung,
            String einheit,
            Double einzelpreis,
            String waehrung,
            String beschreibung,
            Boolean inaktiv,
            String created,
            String modified,
            String neueArtikelnummer,
            Integer id,
            AttributeType[] attributes) {
        this.artikelnummer = artikelnummer;
        this.bezeichnung = bezeichnung;
        this.einheit = einheit;
        this.einzelpreis = einzelpreis;
        this.waehrung = waehrung;
        this.beschreibung = beschreibung;
        this.inaktiv = inaktiv;
        this.created = created;
        this.modified = modified;
        this.neueArtikelnummer = neueArtikelnummer;
        this.id = id;
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
     * Gets the artikelnummer value for this ArtikelType.
     *
     * @return artikelnummer   * Die Nummer des Artikels.
     */
    public String getArtikelnummer() {
        return artikelnummer;
    }

    /**
     * Sets the artikelnummer value for this ArtikelType.
     *
     * @param artikelnummer   * Die Nummer des Artikels.
     */
    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    /**
     * Gets the bezeichnung value for this ArtikelType.
     *
     * @return bezeichnung   * Die Bezeichnung des Artikels.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this ArtikelType.
     *
     * @param bezeichnung   * Die Bezeichnung des Artikels.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the einheit value for this ArtikelType.
     *
     * @return einheit   * Die Einheit des Artikels.
     */
    public String getEinheit() {
        return einheit;
    }

    /**
     * Sets the einheit value for this ArtikelType.
     *
     * @param einheit   * Die Einheit des Artikels.
     */
    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    /**
     * Gets the einzelpreis value for this ArtikelType.
     *
     * @return einzelpreis   * Der Einzelpreis des Artikels.
     */
    public Double getEinzelpreis() {
        return einzelpreis;
    }

    /**
     * Sets the einzelpreis value for this ArtikelType.
     *
     * @param einzelpreis   * Der Einzelpreis des Artikels.
     */
    public void setEinzelpreis(Double einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    /**
     * Gets the waehrung value for this ArtikelType.
     *
     * @return waehrung   * Die Währung des Artikels.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this ArtikelType.
     *
     * @param waehrung   * Die Währung des Artikels.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the beschreibung value for this ArtikelType.
     *
     * @return beschreibung   * Die Beschreibung des Artikels.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Sets the beschreibung value for this ArtikelType.
     *
     * @param beschreibung   * Die Beschreibung des Artikels.
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * Gets the inaktiv value for this ArtikelType.
     *
     * @return inaktiv   * Flagge, ob der Artikel aktiv oder inaktiv ist.
     */
    public Boolean getInaktiv() {
        return inaktiv;
    }

    /**
     * Sets the inaktiv value for this ArtikelType.
     *
     * @param inaktiv   * Flagge, ob der Artikel aktiv oder inaktiv ist.
     */
    public void setInaktiv(Boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    /**
     * Gets the created value for this ArtikelType.
     *
     * @return created   * Das Anlagedatum des Artikels.
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the created value for this ArtikelType.
     *
     * @param created   * Das Anlagedatum des Artikels.
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * Gets the modified value for this ArtikelType.
     *
     * @return modified   * Das Datum der letzten Aktualisierung des Artikels.
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the modified value for this ArtikelType.
     *
     * @param modified   * Das Datum der letzten Aktualisierung des Artikels.
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     * Gets the neueArtikelnummer value for this ArtikelType.
     *
     * @return neueArtikelnummer   * Neue Nummer der Artikels (bei Update der Artikelnummer).
     */
    public String getNeueArtikelnummer() {
        return neueArtikelnummer;
    }

    /**
     * Sets the neueArtikelnummer value for this ArtikelType.
     *
     * @param neueArtikelnummer   * Neue Nummer der Artikels (bei Update der Artikelnummer).
     */
    public void setNeueArtikelnummer(String neueArtikelnummer) {
        this.neueArtikelnummer = neueArtikelnummer;
    }

    /**
     * Gets the id value for this ArtikelType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ArtikelType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the attributes value for this ArtikelType.
     *
     * @return attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public AttributeType[] getAttributes() {
        return attributes;
    }

    /**
     * Sets the attributes value for this ArtikelType.
     *
     * @param attributes   * Liste von Attributen für kundenspezifische Erweiterungen.
     */
    public void setAttributes(AttributeType[] attributes) {
        this.attributes = attributes;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ArtikelType)) return false;
        ArtikelType other = (ArtikelType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.artikelnummer == null && other.getArtikelnummer() == null) ||
                        (this.artikelnummer != null &&
                                this.artikelnummer.equals(other.getArtikelnummer()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.einheit == null && other.getEinheit() == null) ||
                        (this.einheit != null &&
                                this.einheit.equals(other.getEinheit()))) &&
                ((this.einzelpreis == null && other.getEinzelpreis() == null) ||
                        (this.einzelpreis != null &&
                                this.einzelpreis.equals(other.getEinzelpreis()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.beschreibung == null && other.getBeschreibung() == null) ||
                        (this.beschreibung != null &&
                                this.beschreibung.equals(other.getBeschreibung()))) &&
                ((this.inaktiv == null && other.getInaktiv() == null) ||
                        (this.inaktiv != null &&
                                this.inaktiv.equals(other.getInaktiv()))) &&
                ((this.created == null && other.getCreated() == null) ||
                        (this.created != null &&
                                this.created.equals(other.getCreated()))) &&
                ((this.modified == null && other.getModified() == null) ||
                        (this.modified != null &&
                                this.modified.equals(other.getModified()))) &&
                ((this.neueArtikelnummer == null && other.getNeueArtikelnummer() == null) ||
                        (this.neueArtikelnummer != null &&
                                this.neueArtikelnummer.equals(other.getNeueArtikelnummer()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
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
        if (getArtikelnummer() != null) {
            _hashCode += getArtikelnummer().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getEinheit() != null) {
            _hashCode += getEinheit().hashCode();
        }
        if (getEinzelpreis() != null) {
            _hashCode += getEinzelpreis().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getBeschreibung() != null) {
            _hashCode += getBeschreibung().hashCode();
        }
        if (getInaktiv() != null) {
            _hashCode += getInaktiv().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getNeueArtikelnummer() != null) {
            _hashCode += getNeueArtikelnummer().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
