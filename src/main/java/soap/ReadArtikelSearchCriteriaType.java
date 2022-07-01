/**
 * ReadArtikelSearchCriteriaType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Suchkriterien zum Lesen von Artikeln.
 */
public class ReadArtikelSearchCriteriaType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ReadArtikelSearchCriteriaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ReadArtikelSearchCriteriaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artikelnummer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artikelnummer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("inaktiv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inaktiv"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
    /* Flagge, ob aktive oder inaktive Artikel zu liefen sind. */
    private Boolean inaktiv;
    /* Suche nach Artikeln, die nach diesem Datum geändert wurden. */
    private String modifiedSince;
    private Integer id;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public ReadArtikelSearchCriteriaType() {
    }


    public ReadArtikelSearchCriteriaType(
            String artikelnummer,
            String bezeichnung,
            String einheit,
            Double einzelpreis,
            String waehrung,
            Boolean inaktiv,
            String modifiedSince,
            Integer id) {
        this.artikelnummer = artikelnummer;
        this.bezeichnung = bezeichnung;
        this.einheit = einheit;
        this.einzelpreis = einzelpreis;
        this.waehrung = waehrung;
        this.inaktiv = inaktiv;
        this.modifiedSince = modifiedSince;
        this.id = id;
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
     * Gets the artikelnummer value for this ReadArtikelSearchCriteriaType.
     *
     * @return artikelnummer   * Die Nummer des Artikels.
     */
    public String getArtikelnummer() {
        return artikelnummer;
    }

    /**
     * Sets the artikelnummer value for this ReadArtikelSearchCriteriaType.
     *
     * @param artikelnummer   * Die Nummer des Artikels.
     */
    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    /**
     * Gets the bezeichnung value for this ReadArtikelSearchCriteriaType.
     *
     * @return bezeichnung   * Die Bezeichnung des Artikels.
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this ReadArtikelSearchCriteriaType.
     *
     * @param bezeichnung   * Die Bezeichnung des Artikels.
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the einheit value for this ReadArtikelSearchCriteriaType.
     *
     * @return einheit   * Die Einheit des Artikels.
     */
    public String getEinheit() {
        return einheit;
    }

    /**
     * Sets the einheit value for this ReadArtikelSearchCriteriaType.
     *
     * @param einheit   * Die Einheit des Artikels.
     */
    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    /**
     * Gets the einzelpreis value for this ReadArtikelSearchCriteriaType.
     *
     * @return einzelpreis   * Der Einzelpreis des Artikels.
     */
    public Double getEinzelpreis() {
        return einzelpreis;
    }

    /**
     * Sets the einzelpreis value for this ReadArtikelSearchCriteriaType.
     *
     * @param einzelpreis   * Der Einzelpreis des Artikels.
     */
    public void setEinzelpreis(Double einzelpreis) {
        this.einzelpreis = einzelpreis;
    }

    /**
     * Gets the waehrung value for this ReadArtikelSearchCriteriaType.
     *
     * @return waehrung   * Die Währung des Artikels.
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this ReadArtikelSearchCriteriaType.
     *
     * @param waehrung   * Die Währung des Artikels.
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the inaktiv value for this ReadArtikelSearchCriteriaType.
     *
     * @return inaktiv   * Flagge, ob aktive oder inaktive Artikel zu liefen sind.
     */
    public Boolean getInaktiv() {
        return inaktiv;
    }

    /**
     * Sets the inaktiv value for this ReadArtikelSearchCriteriaType.
     *
     * @param inaktiv   * Flagge, ob aktive oder inaktive Artikel zu liefen sind.
     */
    public void setInaktiv(Boolean inaktiv) {
        this.inaktiv = inaktiv;
    }

    /**
     * Gets the modifiedSince value for this ReadArtikelSearchCriteriaType.
     *
     * @return modifiedSince   * Suche nach Artikeln, die nach diesem Datum geändert wurden.
     */
    public String getModifiedSince() {
        return modifiedSince;
    }

    /**
     * Sets the modifiedSince value for this ReadArtikelSearchCriteriaType.
     *
     * @param modifiedSince   * Suche nach Artikeln, die nach diesem Datum geändert wurden.
     */
    public void setModifiedSince(String modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    /**
     * Gets the id value for this ReadArtikelSearchCriteriaType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this ReadArtikelSearchCriteriaType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReadArtikelSearchCriteriaType)) return false;
        ReadArtikelSearchCriteriaType other = (ReadArtikelSearchCriteriaType) obj;
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
                ((this.inaktiv == null && other.getInaktiv() == null) ||
                        (this.inaktiv != null &&
                                this.inaktiv.equals(other.getInaktiv()))) &&
                ((this.modifiedSince == null && other.getModifiedSince() == null) ||
                        (this.modifiedSince != null &&
                                this.modifiedSince.equals(other.getModifiedSince()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId())));
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
        if (getInaktiv() != null) {
            _hashCode += getInaktiv().hashCode();
        }
        if (getModifiedSince() != null) {
            _hashCode += getModifiedSince().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
