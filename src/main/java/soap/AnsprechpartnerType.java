/**
 * AnsprechpartnerType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Kunden-Ansprechpartners.
 */
public class AnsprechpartnerType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AnsprechpartnerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnsprechpartnerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anrede");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anrede"));
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
        elemField.setFieldName("telefon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "handy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("kategorieListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kategorieListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KategorieListeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AdresseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("berufsbezeichnung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "berufsbezeichnung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benutzername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "benutzername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /* Die Id des Ansprechpartners. Pflicht bei
     *                 				Update und Löschen. */
    private Integer id;
    /* Der Vorname des Ansprechpartners.
     *                 				Pflicht bei Anlage. */
    private String vorname;
    /* Der Name des Ansprechpartners. Pflicht
     *                 				bei Anlage. */
    private String name;
    /* Die Anrede des Ansprechpartners. */
    private String anrede;
    /* Der Titel des Ansprechpartners. */
    private String titel;
    /* Die Telefonnummer des Ansprechpartners. */
    private String telefon;
    /* Die Mobilnummer des Ansprechpartners. */
    private String handy;
    /* Die Faxnummer des Ansprechpartners. */
    private String fax;
    /* Die EMail-Adresse des Ansprechpartners. */
    private String email;
    /* Flagge, ob es sich um den primären
     *                 				Ansprechpartner des Kunden handelt. */
    private Boolean isPrimary;
    private String abteilung;
    /* Wird nur beim Lesen zurückgegeben (wird
     *                 				nicht benötigt für create oder update) */
    private String kundenNr;
    private KategorieListeType kategorieListe;
    private AdresseType adresse;
    private String berufsbezeichnung;
    private String benutzername;
    /* Zum Löschen des Ansprechpartner im
     *                 				Rahmen des UpdateKunde-Requests auf
     *                 				'delete' setzen. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AnsprechpartnerType() {
    }


    public AnsprechpartnerType(
            Integer id,
            String vorname,
            String name,
            String anrede,
            String titel,
            String telefon,
            String handy,
            String fax,
            String email,
            Boolean isPrimary,
            String abteilung,
            String kundenNr,
            KategorieListeType kategorieListe,
            AdresseType adresse,
            String berufsbezeichnung,
            String benutzername,
            String action) {
        this.id = id;
        this.vorname = vorname;
        this.name = name;
        this.anrede = anrede;
        this.titel = titel;
        this.telefon = telefon;
        this.handy = handy;
        this.fax = fax;
        this.email = email;
        this.isPrimary = isPrimary;
        this.abteilung = abteilung;
        this.kundenNr = kundenNr;
        this.kategorieListe = kategorieListe;
        this.adresse = adresse;
        this.berufsbezeichnung = berufsbezeichnung;
        this.benutzername = benutzername;
        this.action = action;
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
     * Gets the id value for this AnsprechpartnerType.
     *
     * @return id   * Die Id des Ansprechpartners. Pflicht bei
     *                 				Update und Löschen.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this AnsprechpartnerType.
     *
     * @param id   * Die Id des Ansprechpartners. Pflicht bei
     *                 				Update und Löschen.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the vorname value for this AnsprechpartnerType.
     *
     * @return vorname   * Der Vorname des Ansprechpartners.
     *                 				Pflicht bei Anlage.
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Sets the vorname value for this AnsprechpartnerType.
     *
     * @param vorname   * Der Vorname des Ansprechpartners.
     *                 				Pflicht bei Anlage.
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Gets the name value for this AnsprechpartnerType.
     *
     * @return name   * Der Name des Ansprechpartners. Pflicht
     *                 				bei Anlage.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this AnsprechpartnerType.
     *
     * @param name   * Der Name des Ansprechpartners. Pflicht
     *                 				bei Anlage.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the anrede value for this AnsprechpartnerType.
     *
     * @return anrede   * Die Anrede des Ansprechpartners.
     */
    public String getAnrede() {
        return anrede;
    }

    /**
     * Sets the anrede value for this AnsprechpartnerType.
     *
     * @param anrede   * Die Anrede des Ansprechpartners.
     */
    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    /**
     * Gets the titel value for this AnsprechpartnerType.
     *
     * @return titel   * Der Titel des Ansprechpartners.
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the titel value for this AnsprechpartnerType.
     *
     * @param titel   * Der Titel des Ansprechpartners.
     */
    public void setTitel(String titel) {
        this.titel = titel;
    }

    /**
     * Gets the telefon value for this AnsprechpartnerType.
     *
     * @return telefon   * Die Telefonnummer des Ansprechpartners.
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the telefon value for this AnsprechpartnerType.
     *
     * @param telefon   * Die Telefonnummer des Ansprechpartners.
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * Gets the handy value for this AnsprechpartnerType.
     *
     * @return handy   * Die Mobilnummer des Ansprechpartners.
     */
    public String getHandy() {
        return handy;
    }

    /**
     * Sets the handy value for this AnsprechpartnerType.
     *
     * @param handy   * Die Mobilnummer des Ansprechpartners.
     */
    public void setHandy(String handy) {
        this.handy = handy;
    }

    /**
     * Gets the fax value for this AnsprechpartnerType.
     *
     * @return fax   * Die Faxnummer des Ansprechpartners.
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the fax value for this AnsprechpartnerType.
     *
     * @param fax   * Die Faxnummer des Ansprechpartners.
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * Gets the email value for this AnsprechpartnerType.
     *
     * @return email   * Die EMail-Adresse des Ansprechpartners.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email value for this AnsprechpartnerType.
     *
     * @param email   * Die EMail-Adresse des Ansprechpartners.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the isPrimary value for this AnsprechpartnerType.
     *
     * @return isPrimary   * Flagge, ob es sich um den primären
     *                 				Ansprechpartner des Kunden handelt.
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     * Sets the isPrimary value for this AnsprechpartnerType.
     *
     * @param isPrimary   * Flagge, ob es sich um den primären
     *                 				Ansprechpartner des Kunden handelt.
     */
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     * Gets the abteilung value for this AnsprechpartnerType.
     *
     * @return abteilung
     */
    public String getAbteilung() {
        return abteilung;
    }

    /**
     * Sets the abteilung value for this AnsprechpartnerType.
     *
     * @param abteilung
     */
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    /**
     * Gets the kundenNr value for this AnsprechpartnerType.
     *
     * @return kundenNr   * Wird nur beim Lesen zurückgegeben (wird
     *                 				nicht benötigt für create oder update)
     */
    public String getKundenNr() {
        return kundenNr;
    }

    /**
     * Sets the kundenNr value for this AnsprechpartnerType.
     *
     * @param kundenNr   * Wird nur beim Lesen zurückgegeben (wird
     *                 				nicht benötigt für create oder update)
     */
    public void setKundenNr(String kundenNr) {
        this.kundenNr = kundenNr;
    }

    /**
     * Gets the kategorieListe value for this AnsprechpartnerType.
     *
     * @return kategorieListe
     */
    public KategorieListeType getKategorieListe() {
        return kategorieListe;
    }

    /**
     * Sets the kategorieListe value for this AnsprechpartnerType.
     *
     * @param kategorieListe
     */
    public void setKategorieListe(KategorieListeType kategorieListe) {
        this.kategorieListe = kategorieListe;
    }

    /**
     * Gets the adresse value for this AnsprechpartnerType.
     *
     * @return adresse
     */
    public AdresseType getAdresse() {
        return adresse;
    }

    /**
     * Sets the adresse value for this AnsprechpartnerType.
     *
     * @param adresse
     */
    public void setAdresse(AdresseType adresse) {
        this.adresse = adresse;
    }

    /**
     * Gets the berufsbezeichnung value for this AnsprechpartnerType.
     *
     * @return berufsbezeichnung
     */
    public String getBerufsbezeichnung() {
        return berufsbezeichnung;
    }

    /**
     * Sets the berufsbezeichnung value for this AnsprechpartnerType.
     *
     * @param berufsbezeichnung
     */
    public void setBerufsbezeichnung(String berufsbezeichnung) {
        this.berufsbezeichnung = berufsbezeichnung;
    }

    /**
     * Gets the benutzername value for this AnsprechpartnerType.
     *
     * @return benutzername
     */
    public String getBenutzername() {
        return benutzername;
    }

    /**
     * Sets the benutzername value for this AnsprechpartnerType.
     *
     * @param benutzername
     */
    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    /**
     * Gets the action value for this AnsprechpartnerType.
     *
     * @return action   * Zum Löschen des Ansprechpartner im
     *                 				Rahmen des UpdateKunde-Requests auf
     *                 				'delete' setzen.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this AnsprechpartnerType.
     *
     * @param action   * Zum Löschen des Ansprechpartner im
     *                 				Rahmen des UpdateKunde-Requests auf
     *                 				'delete' setzen.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AnsprechpartnerType)) return false;
        AnsprechpartnerType other = (AnsprechpartnerType) obj;
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
                ((this.vorname == null && other.getVorname() == null) ||
                        (this.vorname != null &&
                                this.vorname.equals(other.getVorname()))) &&
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.anrede == null && other.getAnrede() == null) ||
                        (this.anrede != null &&
                                this.anrede.equals(other.getAnrede()))) &&
                ((this.titel == null && other.getTitel() == null) ||
                        (this.titel != null &&
                                this.titel.equals(other.getTitel()))) &&
                ((this.telefon == null && other.getTelefon() == null) ||
                        (this.telefon != null &&
                                this.telefon.equals(other.getTelefon()))) &&
                ((this.handy == null && other.getHandy() == null) ||
                        (this.handy != null &&
                                this.handy.equals(other.getHandy()))) &&
                ((this.fax == null && other.getFax() == null) ||
                        (this.fax != null &&
                                this.fax.equals(other.getFax()))) &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail()))) &&
                ((this.isPrimary == null && other.getIsPrimary() == null) ||
                        (this.isPrimary != null &&
                                this.isPrimary.equals(other.getIsPrimary()))) &&
                ((this.abteilung == null && other.getAbteilung() == null) ||
                        (this.abteilung != null &&
                                this.abteilung.equals(other.getAbteilung()))) &&
                ((this.kundenNr == null && other.getKundenNr() == null) ||
                        (this.kundenNr != null &&
                                this.kundenNr.equals(other.getKundenNr()))) &&
                ((this.kategorieListe == null && other.getKategorieListe() == null) ||
                        (this.kategorieListe != null &&
                                this.kategorieListe.equals(other.getKategorieListe()))) &&
                ((this.adresse == null && other.getAdresse() == null) ||
                        (this.adresse != null &&
                                this.adresse.equals(other.getAdresse()))) &&
                ((this.berufsbezeichnung == null && other.getBerufsbezeichnung() == null) ||
                        (this.berufsbezeichnung != null &&
                                this.berufsbezeichnung.equals(other.getBerufsbezeichnung()))) &&
                ((this.benutzername == null && other.getBenutzername() == null) ||
                        (this.benutzername != null &&
                                this.benutzername.equals(other.getBenutzername()))) &&
                ((this.action == null && other.getAction() == null) ||
                        (this.action != null &&
                                this.action.equals(other.getAction())));
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
        if (getVorname() != null) {
            _hashCode += getVorname().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getAnrede() != null) {
            _hashCode += getAnrede().hashCode();
        }
        if (getTitel() != null) {
            _hashCode += getTitel().hashCode();
        }
        if (getTelefon() != null) {
            _hashCode += getTelefon().hashCode();
        }
        if (getHandy() != null) {
            _hashCode += getHandy().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getIsPrimary() != null) {
            _hashCode += getIsPrimary().hashCode();
        }
        if (getAbteilung() != null) {
            _hashCode += getAbteilung().hashCode();
        }
        if (getKundenNr() != null) {
            _hashCode += getKundenNr().hashCode();
        }
        if (getKategorieListe() != null) {
            _hashCode += getKategorieListe().hashCode();
        }
        if (getAdresse() != null) {
            _hashCode += getAdresse().hashCode();
        }
        if (getBerufsbezeichnung() != null) {
            _hashCode += getBerufsbezeichnung().hashCode();
        }
        if (getBenutzername() != null) {
            _hashCode += getBenutzername().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
