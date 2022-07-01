/**
 * MassenListeType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Liste der auszuführenden Massen-Operationen.
 */
public class MassenListeType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MassenListeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MassenListeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mitarbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mitarbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MitarbeiterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kunde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kunde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "KundeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projekt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projekt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teilaufgabe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "teilaufgabe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TeilaufgabeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projektzeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projektzeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ProjektzeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beleg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beleg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BelegType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mahlzeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mahlzeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MahlzeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fehlzeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fehlzeit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "FehlzeitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("einplanung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "einplanung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "EinplanungType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artikel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "artikel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "ArtikelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    private MitarbeiterType[] mitarbeiter;
    private KundeType[] kunde;
    private ProjektType[] projekt;
    private TicketType[] ticket;
    private TeilaufgabeType[] teilaufgabe;
    private ProjektzeitType[] projektzeit;
    private BelegType[] beleg;
    private MahlzeitType[] mahlzeit;
    /* für Operation createFehlzeit */
    private FehlzeitType[] fehlzeit;
    private EinplanungType[] einplanung;
    private ArtikelType[] artikel;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;

    public MassenListeType() {
    }

    public MassenListeType(
            MitarbeiterType[] mitarbeiter,
            KundeType[] kunde,
            ProjektType[] projekt,
            TicketType[] ticket,
            TeilaufgabeType[] teilaufgabe,
            ProjektzeitType[] projektzeit,
            BelegType[] beleg,
            MahlzeitType[] mahlzeit,
            FehlzeitType[] fehlzeit,
            EinplanungType[] einplanung,
            ArtikelType[] artikel) {
        this.mitarbeiter = mitarbeiter;
        this.kunde = kunde;
        this.projekt = projekt;
        this.ticket = ticket;
        this.teilaufgabe = teilaufgabe;
        this.projektzeit = projektzeit;
        this.beleg = beleg;
        this.mahlzeit = mahlzeit;
        this.fehlzeit = fehlzeit;
        this.einplanung = einplanung;
        this.artikel = artikel;
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
     * Gets the mitarbeiter value for this MassenListeType.
     *
     * @return mitarbeiter
     */
    public MitarbeiterType[] getMitarbeiter() {
        return mitarbeiter;
    }

    /**
     * Sets the mitarbeiter value for this MassenListeType.
     *
     * @param mitarbeiter
     */
    public void setMitarbeiter(MitarbeiterType[] mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public MitarbeiterType getMitarbeiter(int i) {
        return this.mitarbeiter[i];
    }

    public void setMitarbeiter(int i, MitarbeiterType _value) {
        this.mitarbeiter[i] = _value;
    }

    /**
     * Gets the kunde value for this MassenListeType.
     *
     * @return kunde
     */
    public KundeType[] getKunde() {
        return kunde;
    }

    /**
     * Sets the kunde value for this MassenListeType.
     *
     * @param kunde
     */
    public void setKunde(KundeType[] kunde) {
        this.kunde = kunde;
    }

    public KundeType getKunde(int i) {
        return this.kunde[i];
    }

    public void setKunde(int i, KundeType _value) {
        this.kunde[i] = _value;
    }

    /**
     * Gets the projekt value for this MassenListeType.
     *
     * @return projekt
     */
    public ProjektType[] getProjekt() {
        return projekt;
    }

    /**
     * Sets the projekt value for this MassenListeType.
     *
     * @param projekt
     */
    public void setProjekt(ProjektType[] projekt) {
        this.projekt = projekt;
    }

    public ProjektType getProjekt(int i) {
        return this.projekt[i];
    }

    public void setProjekt(int i, ProjektType _value) {
        this.projekt[i] = _value;
    }

    /**
     * Gets the ticket value for this MassenListeType.
     *
     * @return ticket
     */
    public TicketType[] getTicket() {
        return ticket;
    }

    /**
     * Sets the ticket value for this MassenListeType.
     *
     * @param ticket
     */
    public void setTicket(TicketType[] ticket) {
        this.ticket = ticket;
    }

    public TicketType getTicket(int i) {
        return this.ticket[i];
    }

    public void setTicket(int i, TicketType _value) {
        this.ticket[i] = _value;
    }

    /**
     * Gets the teilaufgabe value for this MassenListeType.
     *
     * @return teilaufgabe
     */
    public TeilaufgabeType[] getTeilaufgabe() {
        return teilaufgabe;
    }

    /**
     * Sets the teilaufgabe value for this MassenListeType.
     *
     * @param teilaufgabe
     */
    public void setTeilaufgabe(TeilaufgabeType[] teilaufgabe) {
        this.teilaufgabe = teilaufgabe;
    }

    public TeilaufgabeType getTeilaufgabe(int i) {
        return this.teilaufgabe[i];
    }

    public void setTeilaufgabe(int i, TeilaufgabeType _value) {
        this.teilaufgabe[i] = _value;
    }

    /**
     * Gets the projektzeit value for this MassenListeType.
     *
     * @return projektzeit
     */
    public ProjektzeitType[] getProjektzeit() {
        return projektzeit;
    }

    /**
     * Sets the projektzeit value for this MassenListeType.
     *
     * @param projektzeit
     */
    public void setProjektzeit(ProjektzeitType[] projektzeit) {
        this.projektzeit = projektzeit;
    }

    public ProjektzeitType getProjektzeit(int i) {
        return this.projektzeit[i];
    }

    public void setProjektzeit(int i, ProjektzeitType _value) {
        this.projektzeit[i] = _value;
    }

    /**
     * Gets the beleg value for this MassenListeType.
     *
     * @return beleg
     */
    public BelegType[] getBeleg() {
        return beleg;
    }

    /**
     * Sets the beleg value for this MassenListeType.
     *
     * @param beleg
     */
    public void setBeleg(BelegType[] beleg) {
        this.beleg = beleg;
    }

    public BelegType getBeleg(int i) {
        return this.beleg[i];
    }

    public void setBeleg(int i, BelegType _value) {
        this.beleg[i] = _value;
    }

    /**
     * Gets the mahlzeit value for this MassenListeType.
     *
     * @return mahlzeit
     */
    public MahlzeitType[] getMahlzeit() {
        return mahlzeit;
    }

    /**
     * Sets the mahlzeit value for this MassenListeType.
     *
     * @param mahlzeit
     */
    public void setMahlzeit(MahlzeitType[] mahlzeit) {
        this.mahlzeit = mahlzeit;
    }

    public MahlzeitType getMahlzeit(int i) {
        return this.mahlzeit[i];
    }

    public void setMahlzeit(int i, MahlzeitType _value) {
        this.mahlzeit[i] = _value;
    }

    /**
     * Gets the fehlzeit value for this MassenListeType.
     *
     * @return fehlzeit   * für Operation createFehlzeit
     */
    public FehlzeitType[] getFehlzeit() {
        return fehlzeit;
    }

    /**
     * Sets the fehlzeit value for this MassenListeType.
     *
     * @param fehlzeit   * für Operation createFehlzeit
     */
    public void setFehlzeit(FehlzeitType[] fehlzeit) {
        this.fehlzeit = fehlzeit;
    }

    public FehlzeitType getFehlzeit(int i) {
        return this.fehlzeit[i];
    }

    public void setFehlzeit(int i, FehlzeitType _value) {
        this.fehlzeit[i] = _value;
    }

    /**
     * Gets the einplanung value for this MassenListeType.
     *
     * @return einplanung
     */
    public EinplanungType[] getEinplanung() {
        return einplanung;
    }

    /**
     * Sets the einplanung value for this MassenListeType.
     *
     * @param einplanung
     */
    public void setEinplanung(EinplanungType[] einplanung) {
        this.einplanung = einplanung;
    }

    public EinplanungType getEinplanung(int i) {
        return this.einplanung[i];
    }

    public void setEinplanung(int i, EinplanungType _value) {
        this.einplanung[i] = _value;
    }

    /**
     * Gets the artikel value for this MassenListeType.
     *
     * @return artikel
     */
    public ArtikelType[] getArtikel() {
        return artikel;
    }

    /**
     * Sets the artikel value for this MassenListeType.
     *
     * @param artikel
     */
    public void setArtikel(ArtikelType[] artikel) {
        this.artikel = artikel;
    }

    public ArtikelType getArtikel(int i) {
        return this.artikel[i];
    }

    public void setArtikel(int i, ArtikelType _value) {
        this.artikel[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MassenListeType)) return false;
        MassenListeType other = (MassenListeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.mitarbeiter == null && other.getMitarbeiter() == null) ||
                        (this.mitarbeiter != null &&
                                java.util.Arrays.equals(this.mitarbeiter, other.getMitarbeiter()))) &&
                ((this.kunde == null && other.getKunde() == null) ||
                        (this.kunde != null &&
                                java.util.Arrays.equals(this.kunde, other.getKunde()))) &&
                ((this.projekt == null && other.getProjekt() == null) ||
                        (this.projekt != null &&
                                java.util.Arrays.equals(this.projekt, other.getProjekt()))) &&
                ((this.ticket == null && other.getTicket() == null) ||
                        (this.ticket != null &&
                                java.util.Arrays.equals(this.ticket, other.getTicket()))) &&
                ((this.teilaufgabe == null && other.getTeilaufgabe() == null) ||
                        (this.teilaufgabe != null &&
                                java.util.Arrays.equals(this.teilaufgabe, other.getTeilaufgabe()))) &&
                ((this.projektzeit == null && other.getProjektzeit() == null) ||
                        (this.projektzeit != null &&
                                java.util.Arrays.equals(this.projektzeit, other.getProjektzeit()))) &&
                ((this.beleg == null && other.getBeleg() == null) ||
                        (this.beleg != null &&
                                java.util.Arrays.equals(this.beleg, other.getBeleg()))) &&
                ((this.mahlzeit == null && other.getMahlzeit() == null) ||
                        (this.mahlzeit != null &&
                                java.util.Arrays.equals(this.mahlzeit, other.getMahlzeit()))) &&
                ((this.fehlzeit == null && other.getFehlzeit() == null) ||
                        (this.fehlzeit != null &&
                                java.util.Arrays.equals(this.fehlzeit, other.getFehlzeit()))) &&
                ((this.einplanung == null && other.getEinplanung() == null) ||
                        (this.einplanung != null &&
                                java.util.Arrays.equals(this.einplanung, other.getEinplanung()))) &&
                ((this.artikel == null && other.getArtikel() == null) ||
                        (this.artikel != null &&
                                java.util.Arrays.equals(this.artikel, other.getArtikel())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMitarbeiter() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMitarbeiter());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMitarbeiter(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getKunde() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getKunde());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getKunde(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjekt() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjekt());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjekt(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTicket() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTicket());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTicket(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTeilaufgabe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTeilaufgabe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTeilaufgabe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjektzeit() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getProjektzeit());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProjektzeit(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBeleg() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getBeleg());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBeleg(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMahlzeit() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMahlzeit());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMahlzeit(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFehlzeit() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFehlzeit());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFehlzeit(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEinplanung() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getEinplanung());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getEinplanung(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArtikel() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getArtikel());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getArtikel(), i);
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
