/**
 * PreisfaktorType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Preisfaktors.
 */
public class PreisfaktorType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PreisfaktorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreisfaktorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("faktor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faktor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taetigkeit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taetigkeit"));
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

    /* Die Id des Preisfaktors. */
    private Integer id;
    /* Der Wochentag, für den der Preisfaktor gilt. Wertebereich:
     * 0=Sonntag,...,6=Samstag,7=Feiertag. Pflicht bei Anlage. */
    private String tag;
    /* Die Uhrzeit, ab der der Preisfaktor gilt. Pflicht bei Anlage.
     * Format: HH:MM */
    private String von;
    /* Die Uhrzeit, bis zu der der Preisfaktor gilt. Pflicht bei Anlage.
     * Format: HH:MM */
    private String bis;
    /* Der Preisfaktor (in Prozent). Pflicht bei Anlage. */
    private Double faktor;
    /* Die Tätigkeit, für die der Preisfaktor gilt. */
    private String taetigkeit;
    /* Aktion. Um den Preisfaktor im Rahmen eines Updates zu löschen
     * muss hier "delete" angegeben werden. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PreisfaktorType() {
    }


    public PreisfaktorType(
            Integer id,
            String tag,
            String von,
            String bis,
            Double faktor,
            String taetigkeit,
            String action) {
        this.id = id;
        this.tag = tag;
        this.von = von;
        this.bis = bis;
        this.faktor = faktor;
        this.taetigkeit = taetigkeit;
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
     * Gets the id value for this PreisfaktorType.
     *
     * @return id   * Die Id des Preisfaktors.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this PreisfaktorType.
     *
     * @param id   * Die Id des Preisfaktors.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the tag value for this PreisfaktorType.
     *
     * @return tag   * Der Wochentag, für den der Preisfaktor gilt. Wertebereich:
     * 0=Sonntag,...,6=Samstag,7=Feiertag. Pflicht bei Anlage.
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the tag value for this PreisfaktorType.
     *
     * @param tag   * Der Wochentag, für den der Preisfaktor gilt. Wertebereich:
     * 0=Sonntag,...,6=Samstag,7=Feiertag. Pflicht bei Anlage.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Gets the von value for this PreisfaktorType.
     *
     * @return von   * Die Uhrzeit, ab der der Preisfaktor gilt. Pflicht bei Anlage.
     * Format: HH:MM
     */
    public String getVon() {
        return von;
    }

    /**
     * Sets the von value for this PreisfaktorType.
     *
     * @param von   * Die Uhrzeit, ab der der Preisfaktor gilt. Pflicht bei Anlage.
     * Format: HH:MM
     */
    public void setVon(String von) {
        this.von = von;
    }

    /**
     * Gets the bis value for this PreisfaktorType.
     *
     * @return bis   * Die Uhrzeit, bis zu der der Preisfaktor gilt. Pflicht bei Anlage.
     * Format: HH:MM
     */
    public String getBis() {
        return bis;
    }

    /**
     * Sets the bis value for this PreisfaktorType.
     *
     * @param bis   * Die Uhrzeit, bis zu der der Preisfaktor gilt. Pflicht bei Anlage.
     * Format: HH:MM
     */
    public void setBis(String bis) {
        this.bis = bis;
    }

    /**
     * Gets the faktor value for this PreisfaktorType.
     *
     * @return faktor   * Der Preisfaktor (in Prozent). Pflicht bei Anlage.
     */
    public Double getFaktor() {
        return faktor;
    }

    /**
     * Sets the faktor value for this PreisfaktorType.
     *
     * @param faktor   * Der Preisfaktor (in Prozent). Pflicht bei Anlage.
     */
    public void setFaktor(Double faktor) {
        this.faktor = faktor;
    }

    /**
     * Gets the taetigkeit value for this PreisfaktorType.
     *
     * @return taetigkeit   * Die Tätigkeit, für die der Preisfaktor gilt.
     */
    public String getTaetigkeit() {
        return taetigkeit;
    }

    /**
     * Sets the taetigkeit value for this PreisfaktorType.
     *
     * @param taetigkeit   * Die Tätigkeit, für die der Preisfaktor gilt.
     */
    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    /**
     * Gets the action value for this PreisfaktorType.
     *
     * @return action   * Aktion. Um den Preisfaktor im Rahmen eines Updates zu löschen
     * muss hier "delete" angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this PreisfaktorType.
     *
     * @param action   * Aktion. Um den Preisfaktor im Rahmen eines Updates zu löschen
     * muss hier "delete" angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreisfaktorType)) return false;
        PreisfaktorType other = (PreisfaktorType) obj;
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
                ((this.tag == null && other.getTag() == null) ||
                        (this.tag != null &&
                                this.tag.equals(other.getTag()))) &&
                ((this.von == null && other.getVon() == null) ||
                        (this.von != null &&
                                this.von.equals(other.getVon()))) &&
                ((this.bis == null && other.getBis() == null) ||
                        (this.bis != null &&
                                this.bis.equals(other.getBis()))) &&
                ((this.faktor == null && other.getFaktor() == null) ||
                        (this.faktor != null &&
                                this.faktor.equals(other.getFaktor()))) &&
                ((this.taetigkeit == null && other.getTaetigkeit() == null) ||
                        (this.taetigkeit != null &&
                                this.taetigkeit.equals(other.getTaetigkeit()))) &&
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
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        if (getVon() != null) {
            _hashCode += getVon().hashCode();
        }
        if (getBis() != null) {
            _hashCode += getBis().hashCode();
        }
        if (getFaktor() != null) {
            _hashCode += getFaktor().hashCode();
        }
        if (getTaetigkeit() != null) {
            _hashCode += getTaetigkeit().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
