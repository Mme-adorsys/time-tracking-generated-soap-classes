/**
 * AngebotType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class AngebotType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AngebotType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AngebotType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("angebotNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "angebotNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bearbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bearbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abteilung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abteilung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kundenNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kundenNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticketNr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auftragsdatum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auftragsdatum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gueltigBis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gueltigBis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betragNetto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betragNetto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auftragsWahrscheinlichkeitProzent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auftragsWahrscheinlichkeitProzent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kategorieListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorieListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieListeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private Integer id;
    private String angebotNr;
    private String titel;
    private String version;
    private Integer status;
    private String bearbeiter;
    private String abteilung;
    private String kundenNr;
    private String projektNr;
    private Integer ticketNr;
    private String auftragsdatum;
    private String gueltigBis;
    private Float betragNetto;
    private String waehrung;
    private String bemerkung;
    private Integer auftragsWahrscheinlichkeitProzent;
    private KategorieListeType kategorieListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AngebotType() {
    }


    public AngebotType(
            Integer id,
            String angebotNr,
            String titel,
            String version,
            Integer status,
            String bearbeiter,
            String abteilung,
            String kundenNr,
            String projektNr,
            Integer ticketNr,
            String auftragsdatum,
            String gueltigBis,
            Float betragNetto,
            String waehrung,
            String bemerkung,
            Integer auftragsWahrscheinlichkeitProzent,
            KategorieListeType kategorieListe) {
        this.id = id;
        this.angebotNr = angebotNr;
        this.titel = titel;
        this.version = version;
        this.status = status;
        this.bearbeiter = bearbeiter;
        this.abteilung = abteilung;
        this.kundenNr = kundenNr;
        this.projektNr = projektNr;
        this.ticketNr = ticketNr;
        this.auftragsdatum = auftragsdatum;
        this.gueltigBis = gueltigBis;
        this.betragNetto = betragNetto;
        this.waehrung = waehrung;
        this.bemerkung = bemerkung;
        this.auftragsWahrscheinlichkeitProzent = auftragsWahrscheinlichkeitProzent;
        this.kategorieListe = kategorieListe;
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
     * Gets the id value for this AngebotType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this AngebotType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the angebotNr value for this AngebotType.
     *
     * @return angebotNr
     */
    public String getAngebotNr() {
        return angebotNr;
    }

    /**
     * Sets the angebotNr value for this AngebotType.
     *
     * @param angebotNr
     */
    public void setAngebotNr(String angebotNr) {
        this.angebotNr = angebotNr;
    }

    /**
     * Gets the titel value for this AngebotType.
     *
     * @return titel
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the titel value for this AngebotType.
     *
     * @param titel
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the version value for this AngebotType.
     *
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the version value for this AngebotType.
     *
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the status value for this AngebotType.
     *
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the status value for this AngebotType.
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * Gets the bearbeiter value for this AngebotType.
     *
     * @return bearbeiter
     */
    public String getBearbeiter() {
        return bearbeiter;
    }

    /**
     * Sets the bearbeiter value for this AngebotType.
     *
     * @param bearbeiter
     */
    public void setBearbeiter(String bearbeiter) {
        this.bearbeiter = bearbeiter;
    }

    /**
     * Gets the abteilung value for this AngebotType.
     *
     * @return abteilung
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this AngebotType.
     *
     * @param abteilung
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the kundenNr value for this AngebotType.
     *
     * @return kundenNr
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this AngebotType.
     *
     * @param kundenNr
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the projektNr value for this AngebotType.
     *
     * @return projektNr
     */
    public String getProjektNr() {
        return projektNr;
    }

    /**
     * Sets the projektNr value for this AngebotType.
     *
     * @param projektNr
     */
    public void setProjektNr(String projektNr) {
        this.projektNr = projektNr;
    }

    /**
     * Gets the ticketNr value for this AngebotType.
     *
     * @return ticketNr
     */
    public Integer getTicketNr() {
        return ticketNr;
    }

    /**
     * Sets the ticketNr value for this AngebotType.
     *
     * @param ticketNr
     */
    public void setTicketNr(Integer ticketNr) {
        this.ticketNr = ticketNr;
    }

    /**
     * Gets the auftragsdatum value for this AngebotType.
     *
     * @return auftragsdatum
     */
    public String getAuftragsdatum() {
        return auftragsdatum;
    }

    /**
     * Sets the auftragsdatum value for this AngebotType.
     *
     * @param auftragsdatum
     */
    public void setAuftragsdatum(String auftragsdatum) {
        this.auftragsdatum = auftragsdatum;
    }

    /**
     * Gets the gueltigBis value for this AngebotType.
     *
     * @return gueltigBis
     */
    public String getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Sets the gueltigBis value for this AngebotType.
     *
     * @param gueltigBis
     */
    public void setGueltigBis(String gueltigBis) {
        this.gueltigBis = gueltigBis;
    }

    /**
     * Gets the betragNetto value for this AngebotType.
     *
     * @return betragNetto
     */
    public Float getBetragNetto() {
        return betragNetto;
    }

    /**
     * Sets the betragNetto value for this AngebotType.
     *
     * @param betragNetto
     */
    public void setBetragNetto(Float betragNetto) {
        this.betragNetto = betragNetto;
    }

    /**
     * Gets the waehrung value for this AngebotType.
     *
     * @return waehrung
     */
    public String getWaehrung() {
        return waehrung;
    }

    /**
     * Sets the waehrung value for this AngebotType.
     *
     * @param waehrung
     */
    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    /**
     * Gets the bemerkung value for this AngebotType.
     *
     * @return bemerkung
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this AngebotType.
     *
     * @param bemerkung
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the auftragsWahrscheinlichkeitProzent value for this AngebotType.
     *
     * @return auftragsWahrscheinlichkeitProzent
     */
    public Integer getAuftragsWahrscheinlichkeitProzent() {
        return auftragsWahrscheinlichkeitProzent;
    }

    /**
     * Sets the auftragsWahrscheinlichkeitProzent value for this AngebotType.
     *
     * @param auftragsWahrscheinlichkeitProzent
     */
    public void setAuftragsWahrscheinlichkeitProzent(Integer auftragsWahrscheinlichkeitProzent) {
        this.auftragsWahrscheinlichkeitProzent = auftragsWahrscheinlichkeitProzent;
    }

    /**
     * Gets the kategorieListe value for this AngebotType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this AngebotType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AngebotType)) return false;
        AngebotType other = (AngebotType) obj;
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
                ((this.angebotNr == null && other.getAngebotNr() == null) ||
                        (this.angebotNr != null &&
                                this.angebotNr.equals(other.getAngebotNr()))) &&
                ((this.titel == null && other.getTitel() == null) ||
                        (this.titel != null &&
                                this.titel.equals(other.getTitel()))) &&
                ((this.version == null && other.getVersion() == null) ||
                        (this.version != null &&
                                this.version.equals(other.getVersion()))) &&
                ((this.status == null && other.getStatus() == null) ||
                        (this.status != null &&
                                this.status.equals(other.getStatus()))) &&
                ((this.bearbeiter == null && other.getBearbeiter() == null) ||
                        (this.bearbeiter != null &&
                                this.bearbeiter.equals(other.getBearbeiter()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.projektNr == null && other.getProjektNr() == null) ||
                        (this.projektNr != null &&
                                this.projektNr.equals(other.getProjektNr()))) &&
                ((this.ticketNr == null && other.getTicketNr() == null) ||
                        (this.ticketNr != null &&
                                this.ticketNr.equals(other.getTicketNr()))) &&
                ((this.auftragsdatum == null && other.getAuftragsdatum() == null) ||
                        (this.auftragsdatum != null &&
                                this.auftragsdatum.equals(other.getAuftragsdatum()))) &&
                ((this.gueltigBis == null && other.getGueltigBis() == null) ||
                        (this.gueltigBis != null &&
                                this.gueltigBis.equals(other.getGueltigBis()))) &&
                ((this.betragNetto == null && other.getBetragNetto() == null) ||
                        (this.betragNetto != null &&
                                this.betragNetto.equals(other.getBetragNetto()))) &&
                ((this.waehrung == null && other.getWaehrung() == null) ||
                        (this.waehrung != null &&
                                this.waehrung.equals(other.getWaehrung()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.auftragsWahrscheinlichkeitProzent == null && other.getAuftragsWahrscheinlichkeitProzent() == null) ||
                        (this.auftragsWahrscheinlichkeitProzent != null &&
                                this.auftragsWahrscheinlichkeitProzent.equals(other.getAuftragsWahrscheinlichkeitProzent()))) &&
                ((this.kategorieListe == null && other.getKategorieListe() == null) ||
                        (this.kategorieListe != null &&
                                this.kategorieListe.equals(other.getKategorieListe())));
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
        if (getAngebotNr() != null) {
            _hashCode += getAngebotNr().hashCode();
        }
        if (getTitel() != null) {
            _hashCode += getTitel().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBearbeiter() != null) {
            _hashCode += getBearbeiter().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getProjektNr() != null) {
            _hashCode += getProjektNr().hashCode();
        }
        if (getTicketNr() != null) {
            _hashCode += getTicketNr().hashCode();
        }
        if (getAuftragsdatum() != null) {
            _hashCode += getAuftragsdatum().hashCode();
        }
        if (getGueltigBis() != null) {
            _hashCode += getGueltigBis().hashCode();
        }
        if (getBetragNetto() != null) {
            _hashCode += getBetragNetto().hashCode();
        }
        if (getWaehrung() != null) {
            _hashCode += getWaehrung().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getAuftragsWahrscheinlichkeitProzent() != null) {
            _hashCode += getAuftragsWahrscheinlichkeitProzent().hashCode();
        }
        if (getKategorieListe() != null) {
            _hashCode += getKategorieListe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
