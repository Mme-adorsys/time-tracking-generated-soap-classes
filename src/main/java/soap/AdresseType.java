/**
 * AdresseType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Eine einzelne Adresse.
 */
public class AdresseType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(AdresseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AdresseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("namenszusatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namenszusatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adressZeile1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adressZeile1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adressZeile2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adressZeile2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adressZeile3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adressZeile3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("land");
        elemField.setXmlName(new javax.xml.namespace.QName("", "land"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istStandard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istStandard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alsRechnungsadresse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alsRechnungsadresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alsLieferadresse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alsLieferadresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechnungsversandMailAdresse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechnungsversandMailAdresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maschinenlesbaresRechnungsversand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maschinenlesbaresRechnungsversand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

    /* Eindeutige Id der Adresse. Pflicht bei
     *                 				Änderung und Löschen. */
    private Integer id;
    /* Der Firmenname o.ä. */
    private String name;
    private String namenszusatz;
    /* Erste Zeile der Adresse. */
    private String adressZeile1;
    /* Zweite Zeile der Adresse. */
    private String adressZeile2;
    /* Dritte Zeile der Adresse. */
    private String adressZeile3;
    /* Die Postleitzahl (PLZ) der Adresse. */
    private String plz;
    /* Der Ort der Adresse. */
    private String ort;
    /* Das Land der Adresse. */
    private String land;
    /* Flagge, ob es sich um die
     *                 				Standard-Adresse handelt. Wenn nur eine
     *                 				Adresse gegeben ist und nicht explizit
     *                 				isStandard den Wert false hat wird dies
     *                 				als Standard gesetzt. */
    private Boolean istStandard;
    /* Flagge, ob die Adresse als
     *                 				Rechnungsadresse verwendet werden soll. */
    private Boolean alsRechnungsadresse;
    private Boolean alsLieferadresse;
    /* Eine oder mehrere Empfängeradressen
     *                 				separiert durch Komma oder Semikolon
     *                 				angeben. (optional) */
    private String rechnungsversandMailAdresse;
    /* 0=nein , 1=ZUGFeRD1 , 2=ZUGFeRD2 ,
     *                 				99=Swiss QR Code */
    private Integer maschinenlesbaresRechnungsversand;
    /* in Kunde: "delete" um die Adresse beim
     *                 				Update zu löschenmuss hier "delete"
     *                 				angegeben werden.
     *
     *                 				in Ansprechpartner: Aktion um: 1.
     *                 				"create" um die Adresse in
     *                 				Kundenadressen anzulegen damit dann dem
     *                 				Ansprechpartner zugordnen zu können. 2.
     *                 				"delete", um die Zuordnung dieser
     *                 				Adresse zu Ansprechpartnet zu löschen (
     *                 				nur die Zuordnung nicht die Adresse
     *                 				selbst). */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public AdresseType() {
    }


    public AdresseType(
            Integer id,
            String name,
            String namenszusatz,
            String adressZeile1,
            String adressZeile2,
            String adressZeile3,
            String plz,
            String ort,
            String land,
            Boolean istStandard,
            Boolean alsRechnungsadresse,
            Boolean alsLieferadresse,
            String rechnungsversandMailAdresse,
            Integer maschinenlesbaresRechnungsversand,
            String action) {
        this.id = id;
        this.name = name;
        this.namenszusatz = namenszusatz;
        this.adressZeile1 = adressZeile1;
        this.adressZeile2 = adressZeile2;
        this.adressZeile3 = adressZeile3;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
        this.istStandard = istStandard;
        this.alsRechnungsadresse = alsRechnungsadresse;
        this.alsLieferadresse = alsLieferadresse;
        this.rechnungsversandMailAdresse = rechnungsversandMailAdresse;
        this.maschinenlesbaresRechnungsversand = maschinenlesbaresRechnungsversand;
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
     * Gets the id value for this AdresseType.
     *
     * @return id   * Eindeutige Id der Adresse. Pflicht bei
     *                 				Änderung und Löschen.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this AdresseType.
     *
     * @param id   * Eindeutige Id der Adresse. Pflicht bei
     *                 				Änderung und Löschen.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the name value for this AdresseType.
     *
     * @return name   * Der Firmenname o.ä.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name value for this AdresseType.
     *
     * @param name   * Der Firmenname o.ä.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the namenszusatz value for this AdresseType.
     *
     * @return namenszusatz
     */
    public String getNamenszusatz() {
        return namenszusatz;
    }

    /**
     * Sets the namenszusatz value for this AdresseType.
     *
     * @param namenszusatz
     */
    public void setNamenszusatz(String namenszusatz) {
        this.namenszusatz = namenszusatz;
    }

    /**
     * Gets the adressZeile1 value for this AdresseType.
     *
     * @return adressZeile1   * Erste Zeile der Adresse.
     */
    public String getAdressZeile1() {
        return adressZeile1;
    }

    /**
     * Sets the adressZeile1 value for this AdresseType.
     *
     * @param adressZeile1   * Erste Zeile der Adresse.
     */
    public void setAdressZeile1(String adressZeile1) {
        this.adressZeile1 = adressZeile1;
    }

    /**
     * Gets the adressZeile2 value for this AdresseType.
     *
     * @return adressZeile2   * Zweite Zeile der Adresse.
     */
    public String getAdressZeile2() {
        return adressZeile2;
    }

    /**
     * Sets the adressZeile2 value for this AdresseType.
     *
     * @param adressZeile2   * Zweite Zeile der Adresse.
     */
    public void setAdressZeile2(String adressZeile2) {
        this.adressZeile2 = adressZeile2;
    }

    /**
     * Gets the adressZeile3 value for this AdresseType.
     *
     * @return adressZeile3   * Dritte Zeile der Adresse.
     */
    public String getAdressZeile3() {
        return adressZeile3;
    }

    /**
     * Sets the adressZeile3 value for this AdresseType.
     *
     * @param adressZeile3   * Dritte Zeile der Adresse.
     */
    public void setAdressZeile3(String adressZeile3) {
        this.adressZeile3 = adressZeile3;
    }

    /**
     * Gets the plz value for this AdresseType.
     *
     * @return plz   * Die Postleitzahl (PLZ) der Adresse.
     */
    public String getPlz() {
        return plz;
    }

    /**
     * Sets the plz value for this AdresseType.
     *
     * @param plz   * Die Postleitzahl (PLZ) der Adresse.
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * Gets the ort value for this AdresseType.
     *
     * @return ort   * Der Ort der Adresse.
     */
    public String getOrt() {
        return ort;
    }

    /**
     * Sets the ort value for this AdresseType.
     *
     * @param ort   * Der Ort der Adresse.
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * Gets the land value for this AdresseType.
     *
     * @return land   * Das Land der Adresse.
     */
    public String getLand() {
        return land;
    }

    /**
     * Sets the land value for this AdresseType.
     *
     * @param land   * Das Land der Adresse.
     */
    public void setLand(String land) {
        this.land = land;
    }

    /**
     * Gets the istStandard value for this AdresseType.
     *
     * @return istStandard   * Flagge, ob es sich um die
     *                 				Standard-Adresse handelt. Wenn nur eine
     *                 				Adresse gegeben ist und nicht explizit
     *                 				isStandard den Wert false hat wird dies
     *                 				als Standard gesetzt.
     */
    public Boolean getIstStandard() {
        return istStandard;
    }

    /**
     * Sets the istStandard value for this AdresseType.
     *
     * @param istStandard   * Flagge, ob es sich um die
     *                 				Standard-Adresse handelt. Wenn nur eine
     *                 				Adresse gegeben ist und nicht explizit
     *                 				isStandard den Wert false hat wird dies
     *                 				als Standard gesetzt.
     */
    public void setIstStandard(Boolean istStandard) {
        this.istStandard = istStandard;
    }

    /**
     * Gets the alsRechnungsadresse value for this AdresseType.
     *
     * @return alsRechnungsadresse   * Flagge, ob die Adresse als
     *                 				Rechnungsadresse verwendet werden soll.
     */
    public Boolean getAlsRechnungsadresse() {
        return alsRechnungsadresse;
    }

    /**
     * Sets the alsRechnungsadresse value for this AdresseType.
     *
     * @param alsRechnungsadresse   * Flagge, ob die Adresse als
     *                 				Rechnungsadresse verwendet werden soll.
     */
    public void setAlsRechnungsadresse(Boolean alsRechnungsadresse) {
        this.alsRechnungsadresse = alsRechnungsadresse;
    }

    /**
     * Gets the alsLieferadresse value for this AdresseType.
     *
     * @return alsLieferadresse
     */
    public Boolean getAlsLieferadresse() {
        return alsLieferadresse;
    }

    /**
     * Sets the alsLieferadresse value for this AdresseType.
     *
     * @param alsLieferadresse
     */
    public void setAlsLieferadresse(Boolean alsLieferadresse) {
        this.alsLieferadresse = alsLieferadresse;
    }

    /**
     * Gets the rechnungsversandMailAdresse value for this AdresseType.
     *
     * @return rechnungsversandMailAdresse   * Eine oder mehrere Empfängeradressen
     *                 				separiert durch Komma oder Semikolon
     *                 				angeben. (optional)
     */
    public String getRechnungsversandMailAdresse() {
        return rechnungsversandMailAdresse;
    }

    /**
     * Sets the rechnungsversandMailAdresse value for this AdresseType.
     *
     * @param rechnungsversandMailAdresse   * Eine oder mehrere Empfängeradressen
     *                 				separiert durch Komma oder Semikolon
     *                 				angeben. (optional)
     */
    public void setRechnungsversandMailAdresse(String rechnungsversandMailAdresse) {
        this.rechnungsversandMailAdresse = rechnungsversandMailAdresse;
    }

    /**
     * Gets the maschinenlesbaresRechnungsversand value for this AdresseType.
     *
     * @return maschinenlesbaresRechnungsversand   * 0=nein , 1=ZUGFeRD1 , 2=ZUGFeRD2 ,
     *                 				99=Swiss QR Code
     */
    public Integer getMaschinenlesbaresRechnungsversand() {
        return maschinenlesbaresRechnungsversand;
    }

    /**
     * Sets the maschinenlesbaresRechnungsversand value for this AdresseType.
     *
     * @param maschinenlesbaresRechnungsversand   * 0=nein , 1=ZUGFeRD1 , 2=ZUGFeRD2 ,
     *                 				99=Swiss QR Code
     */
    public void setMaschinenlesbaresRechnungsversand(Integer maschinenlesbaresRechnungsversand) {
        this.maschinenlesbaresRechnungsversand = maschinenlesbaresRechnungsversand;
    }

    /**
     * Gets the action value for this AdresseType.
     *
     * @return action   * in Kunde: "delete" um die Adresse beim
     *                 				Update zu löschenmuss hier "delete"
     *                 				angegeben werden.
     *
     *                 				in Ansprechpartner: Aktion um: 1.
     *                 				"create" um die Adresse in
     *                 				Kundenadressen anzulegen damit dann dem
     *                 				Ansprechpartner zugordnen zu können. 2.
     *                 				"delete", um die Zuordnung dieser
     *                 				Adresse zu Ansprechpartnet zu löschen (
     *                 				nur die Zuordnung nicht die Adresse
     *                 				selbst).
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this AdresseType.
     *
     * @param action   * in Kunde: "delete" um die Adresse beim
     *                 				Update zu löschenmuss hier "delete"
     *                 				angegeben werden.
     *
     *                 				in Ansprechpartner: Aktion um: 1.
     *                 				"create" um die Adresse in
     *                 				Kundenadressen anzulegen damit dann dem
     *                 				Ansprechpartner zugordnen zu können. 2.
     *                 				"delete", um die Zuordnung dieser
     *                 				Adresse zu Ansprechpartnet zu löschen (
     *                 				nur die Zuordnung nicht die Adresse
     *                 				selbst).
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AdresseType)) return false;
        AdresseType other = (AdresseType) obj;
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
                ((this.name == null && other.getName() == null) ||
                        (this.name != null &&
                                this.name.equals(other.getName()))) &&
                ((this.namenszusatz == null && other.getNamenszusatz() == null) ||
                        (this.namenszusatz != null &&
                                this.namenszusatz.equals(other.getNamenszusatz()))) &&
                ((this.adressZeile1 == null && other.getAdressZeile1() == null) ||
                        (this.adressZeile1 != null &&
                                this.adressZeile1.equals(other.getAdressZeile1()))) &&
                ((this.adressZeile2 == null && other.getAdressZeile2() == null) ||
                        (this.adressZeile2 != null &&
                                this.adressZeile2.equals(other.getAdressZeile2()))) &&
                ((this.adressZeile3 == null && other.getAdressZeile3() == null) ||
                        (this.adressZeile3 != null &&
                                this.adressZeile3.equals(other.getAdressZeile3()))) &&
                ((this.plz == null && other.getPlz() == null) ||
                        (this.plz != null &&
                                this.plz.equals(other.getPlz()))) &&
                ((this.ort == null && other.getOrt() == null) ||
                        (this.ort != null &&
                                this.ort.equals(other.getOrt()))) &&
                ((this.land == null && other.getLand() == null) ||
                        (this.land != null &&
                                this.land.equals(other.getLand()))) &&
                ((this.istStandard == null && other.getIstStandard() == null) ||
                        (this.istStandard != null &&
                                this.istStandard.equals(other.getIstStandard()))) &&
                ((this.alsRechnungsadresse == null && other.getAlsRechnungsadresse() == null) ||
                        (this.alsRechnungsadresse != null &&
                                this.alsRechnungsadresse.equals(other.getAlsRechnungsadresse()))) &&
                ((this.alsLieferadresse == null && other.getAlsLieferadresse() == null) ||
                        (this.alsLieferadresse != null &&
                                this.alsLieferadresse.equals(other.getAlsLieferadresse()))) &&
                ((this.rechnungsversandMailAdresse == null && other.getRechnungsversandMailAdresse() == null) ||
                        (this.rechnungsversandMailAdresse != null &&
                                this.rechnungsversandMailAdresse.equals(other.getRechnungsversandMailAdresse()))) &&
                ((this.maschinenlesbaresRechnungsversand == null && other.getMaschinenlesbaresRechnungsversand() == null) ||
                        (this.maschinenlesbaresRechnungsversand != null &&
                                this.maschinenlesbaresRechnungsversand.equals(other.getMaschinenlesbaresRechnungsversand()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNamenszusatz() != null) {
            _hashCode += getNamenszusatz().hashCode();
        }
        if (getAdressZeile1() != null) {
            _hashCode += getAdressZeile1().hashCode();
        }
        if (getAdressZeile2() != null) {
            _hashCode += getAdressZeile2().hashCode();
        }
        if (getAdressZeile3() != null) {
            _hashCode += getAdressZeile3().hashCode();
        }
        if (getPlz() != null) {
            _hashCode += getPlz().hashCode();
        }
        if (getOrt() != null) {
            _hashCode += getOrt().hashCode();
        }
        if (getLand() != null) {
            _hashCode += getLand().hashCode();
        }
        if (getIstStandard() != null) {
            _hashCode += getIstStandard().hashCode();
        }
        if (getAlsRechnungsadresse() != null) {
            _hashCode += getAlsRechnungsadresse().hashCode();
        }
        if (getAlsLieferadresse() != null) {
            _hashCode += getAlsLieferadresse().hashCode();
        }
        if (getRechnungsversandMailAdresse() != null) {
            _hashCode += getRechnungsversandMailAdresse().hashCode();
        }
        if (getMaschinenlesbaresRechnungsversand() != null) {
            _hashCode += getMaschinenlesbaresRechnungsversand().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
