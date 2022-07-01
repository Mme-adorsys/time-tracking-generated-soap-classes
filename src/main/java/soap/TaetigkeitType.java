/**
 * TaetigkeitType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;

public class TaetigkeitType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TaetigkeitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TaetigkeitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taetigkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taetigkeit"));
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istReise");
        elemField.setXmlName(new javax.xml.namespace.QName("", "istReise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("darfUeberschneiden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "darfUeberschneiden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nichFakturierbarAuswertbar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nichFakturierbarAuswertbar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    private String taetigkeit;
    private String bezeichnung;
    private String bemerkung;
    private Boolean istReise;
    /* true : darf sich mit anderen überschneiden, ist nicht arbeitsteitrelevant,
     * nicht VMA-relevant und darf mit Dauer 0 gebucht werden.
     *                                 z.B. Rufbereitschaft */
    private Boolean darfUeberschneiden;
    /* true : auch 'nicht fakturierbar' gebuchte Projektzeiten sind
     * auf Projektzeitnachweis, Projektumsatz und Rechnungsanhang sichtbar.
     * z.B. Kulanz */
    private Boolean nichFakturierbarAuswertbar;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TaetigkeitType() {
    }


    public TaetigkeitType(
            String taetigkeit,
            String bezeichnung,
            String bemerkung,
            Boolean istReise,
            Boolean darfUeberschneiden,
            Boolean nichFakturierbarAuswertbar) {
        this.taetigkeit = taetigkeit;
        this.bezeichnung = bezeichnung;
        this.bemerkung = bemerkung;
        this.istReise = istReise;
        this.darfUeberschneiden = darfUeberschneiden;
        this.nichFakturierbarAuswertbar = nichFakturierbarAuswertbar;
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
     * Gets the taetigkeit value for this TaetigkeitType.
     *
     * @return taetigkeit
     */
    public String getTaetigkeit() {
        return taetigkeit;
    }

    /**
     * Sets the taetigkeit value for this TaetigkeitType.
     *
     * @param taetigkeit
     */
    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    /**
     * Gets the bezeichnung value for this TaetigkeitType.
     *
     * @return bezeichnung
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Sets the bezeichnung value for this TaetigkeitType.
     *
     * @param bezeichnung
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Gets the bemerkung value for this TaetigkeitType.
     *
     * @return bemerkung
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this TaetigkeitType.
     *
     * @param bemerkung
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the istReise value for this TaetigkeitType.
     *
     * @return istReise
     */
    public Boolean getIstReise() {
        return istReise;
    }

    /**
     * Sets the istReise value for this TaetigkeitType.
     *
     * @param istReise
     */
    public void setIstReise(Boolean istReise) {
        this.istReise = istReise;
    }

    /**
     * Gets the darfUeberschneiden value for this TaetigkeitType.
     *
     * @return darfUeberschneiden   * true : darf sich mit anderen überschneiden, ist nicht arbeitsteitrelevant,
     * nicht VMA-relevant und darf mit Dauer 0 gebucht werden.
     *                                 z.B. Rufbereitschaft
     */
    public Boolean getDarfUeberschneiden() {
        return darfUeberschneiden;
    }

    /**
     * Sets the darfUeberschneiden value for this TaetigkeitType.
     *
     * @param darfUeberschneiden   * true : darf sich mit anderen überschneiden, ist nicht arbeitsteitrelevant,
     * nicht VMA-relevant und darf mit Dauer 0 gebucht werden.
     *                                 z.B. Rufbereitschaft
     */
    public void setDarfUeberschneiden(Boolean darfUeberschneiden) {
        this.darfUeberschneiden = darfUeberschneiden;
    }

    /**
     * Gets the nichFakturierbarAuswertbar value for this TaetigkeitType.
     *
     * @return nichFakturierbarAuswertbar   * true : auch 'nicht fakturierbar' gebuchte Projektzeiten sind
     * auf Projektzeitnachweis, Projektumsatz und Rechnungsanhang sichtbar.
     * z.B. Kulanz
     */
    public Boolean getNichFakturierbarAuswertbar() {
        return nichFakturierbarAuswertbar;
    }

    /**
     * Sets the nichFakturierbarAuswertbar value for this TaetigkeitType.
     *
     * @param nichFakturierbarAuswertbar   * true : auch 'nicht fakturierbar' gebuchte Projektzeiten sind
     * auf Projektzeitnachweis, Projektumsatz und Rechnungsanhang sichtbar.
     * z.B. Kulanz
     */
    public void setNichFakturierbarAuswertbar(Boolean nichFakturierbarAuswertbar) {
        this.nichFakturierbarAuswertbar = nichFakturierbarAuswertbar;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaetigkeitType)) return false;
        TaetigkeitType other = (TaetigkeitType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.taetigkeit == null && other.getTaetigkeit() == null) ||
                        (this.taetigkeit != null &&
                                this.taetigkeit.equals(other.getTaetigkeit()))) &&
                ((this.bezeichnung == null && other.getBezeichnung() == null) ||
                        (this.bezeichnung != null &&
                                this.bezeichnung.equals(other.getBezeichnung()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.istReise == null && other.getIstReise() == null) ||
                        (this.istReise != null &&
                                this.istReise.equals(other.getIstReise()))) &&
                ((this.darfUeberschneiden == null && other.getDarfUeberschneiden() == null) ||
                        (this.darfUeberschneiden != null &&
                                this.darfUeberschneiden.equals(other.getDarfUeberschneiden()))) &&
                ((this.nichFakturierbarAuswertbar == null && other.getNichFakturierbarAuswertbar() == null) ||
                        (this.nichFakturierbarAuswertbar != null &&
                                this.nichFakturierbarAuswertbar.equals(other.getNichFakturierbarAuswertbar())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTaetigkeit() != null) {
            _hashCode += getTaetigkeit().hashCode();
        }
        if (getBezeichnung() != null) {
            _hashCode += getBezeichnung().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getIstReise() != null) {
            _hashCode += getIstReise().hashCode();
        }
        if (getDarfUeberschneiden() != null) {
            _hashCode += getDarfUeberschneiden().hashCode();
        }
        if (getNichFakturierbarAuswertbar() != null) {
            _hashCode += getNichFakturierbarAuswertbar().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
