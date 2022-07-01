/**
 * BeschaeftigungszeitType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Dies eingeben nur wenn Beschaeftigungsbeginn von Erstellungsdatum
 * abweichen soll, diese wird per default angelegt.
 */
public class BeschaeftigungszeitType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(BeschaeftigungszeitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "BeschaeftigungszeitType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("bemerkung");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bemerkung"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlaubsanpruchInDiesemZeitraum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlaubsanpruchInDiesemZeitraum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlaubsanspruchProJahr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlaubsanspruchProJahr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fehltagInStunden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fehltagInStunden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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

    /* Die Id des Beschäftigungszeitraumes. */
    private Integer id;
    /* Die Userid des Benutzers, dem dieser
     *                 				Beschäftigungszeitraum zugeordnet ist. */
    private String userId;
    /* Das Startdatum des
     *                 				Beschäftigungszeitraum. */
    private String startdatum;
    /* Das Endedatum des
     *                 				Beschäftigungszeitraum. Leer oder nicht
     *                 				angegeben = unbefristet (Es darf nicht
     *                 				zwei Beschaeftigungszeiten mit leerem
     *                 				Enddatum geben). */
    private String enddatum;
    /* Eine Bemekung zum
     *                 				Beschäftigungszeitraum. */
    private String bemerkung;
    /* Entweder urlaubsanpruchInDiesemZeitraum
     *                 				oder urlaubsanspruchProJahr darf ein
     *                 				Wert haben. Wenn beide Wert haben dann
     *                 				wird nur bei
     *                 				urlaubsanpruchInDiesemZeitraum
     *                 				gespeichert. */
    private Float urlaubsanpruchInDiesemZeitraum;
    /* Entweder urlaubsanpruchInDiesemZeitraum
     *                 				oder urlaubsanspruchProJahr darf ein
     *                 				Wert haben. Wenn beide Wert haben dann
     *                 				wird nur bei
     *                 				urlaubsanpruchInDiesemZeitraum
     *                 				gespeichert. */
    private Float urlaubsanspruchProJahr;
    /* 0 = jeder Fehltag ist soviel Wert wie die regelarbeitszeit
     * an dem Tag,
     * eine Zahl = Der Wert des Fehltages wird anhand dieser Zahl berechnet. */
    private Float fehltagInStunden;
    /* Die mit dem Beschäftigungszeitraum
     *                 				durchzuführende Aktion. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public BeschaeftigungszeitType() {
    }


    public BeschaeftigungszeitType(
            Integer id,
            String userId,
            String startdatum,
            String enddatum,
            String bemerkung,
            Float urlaubsanpruchInDiesemZeitraum,
            Float urlaubsanspruchProJahr,
            Float fehltagInStunden,
            String action) {
        this.id = id;
        this.userId = userId;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
        this.bemerkung = bemerkung;
        this.urlaubsanpruchInDiesemZeitraum = urlaubsanpruchInDiesemZeitraum;
        this.urlaubsanspruchProJahr = urlaubsanspruchProJahr;
        this.fehltagInStunden = fehltagInStunden;
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
     * Gets the id value for this BeschaeftigungszeitType.
     *
     * @return id   * Die Id des Beschäftigungszeitraumes.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this BeschaeftigungszeitType.
     *
     * @param id   * Die Id des Beschäftigungszeitraumes.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this BeschaeftigungszeitType.
     *
     * @return userId   * Die Userid des Benutzers, dem dieser
     *                 				Beschäftigungszeitraum zugeordnet ist.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this BeschaeftigungszeitType.
     *
     * @param userId   * Die Userid des Benutzers, dem dieser
     *                 				Beschäftigungszeitraum zugeordnet ist.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the startdatum value for this BeschaeftigungszeitType.
     *
     * @return startdatum   * Das Startdatum des
     *                 				Beschäftigungszeitraum.
     */
    public String getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the startdatum value for this BeschaeftigungszeitType.
     *
     * @param startdatum   * Das Startdatum des
     *                 				Beschäftigungszeitraum.
     */
    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    /**
     * Gets the enddatum value for this BeschaeftigungszeitType.
     *
     * @return enddatum   * Das Endedatum des
     *                 				Beschäftigungszeitraum. Leer oder nicht
     *                 				angegeben = unbefristet (Es darf nicht
     *                 				zwei Beschaeftigungszeiten mit leerem
     *                 				Enddatum geben).
     */
    public String getEnddatum() {
        return enddatum;
    }

    /**
     * Sets the enddatum value for this BeschaeftigungszeitType.
     *
     * @param enddatum   * Das Endedatum des
     *                 				Beschäftigungszeitraum. Leer oder nicht
     *                 				angegeben = unbefristet (Es darf nicht
     *                 				zwei Beschaeftigungszeiten mit leerem
     *                 				Enddatum geben).
     */
    public void setEnddatum(String enddatum) {
        this.enddatum = enddatum;
    }

    /**
     * Gets the bemerkung value for this BeschaeftigungszeitType.
     *
     * @return bemerkung   * Eine Bemekung zum
     *                 				Beschäftigungszeitraum.
     */
    public String getBemerkung() {
        return bemerkung;
    }

    /**
     * Sets the bemerkung value for this BeschaeftigungszeitType.
     *
     * @param bemerkung   * Eine Bemekung zum
     *                 				Beschäftigungszeitraum.
     */
    public void setBemerkung(String bemerkung) {
        this.bemerkung = bemerkung;
    }

    /**
     * Gets the urlaubsanpruchInDiesemZeitraum value for this BeschaeftigungszeitType.
     *
     * @return urlaubsanpruchInDiesemZeitraum   * Entweder urlaubsanpruchInDiesemZeitraum
     *                 				oder urlaubsanspruchProJahr darf ein
     *                 				Wert haben. Wenn beide Wert haben dann
     *                 				wird nur bei
     *                 				urlaubsanpruchInDiesemZeitraum
     *                 				gespeichert.
     */
    public Float getUrlaubsanpruchInDiesemZeitraum() {
        return urlaubsanpruchInDiesemZeitraum;
    }

    /**
     * Sets the urlaubsanpruchInDiesemZeitraum value for this BeschaeftigungszeitType.
     *
     * @param urlaubsanpruchInDiesemZeitraum   * Entweder urlaubsanpruchInDiesemZeitraum
     *                 				oder urlaubsanspruchProJahr darf ein
     *                 				Wert haben. Wenn beide Wert haben dann
     *                 				wird nur bei
     *                 				urlaubsanpruchInDiesemZeitraum
     *                 				gespeichert.
     */
    public void setUrlaubsanpruchInDiesemZeitraum(Float urlaubsanpruchInDiesemZeitraum) {
        this.urlaubsanpruchInDiesemZeitraum = urlaubsanpruchInDiesemZeitraum;
    }

    /**
     * Gets the urlaubsanspruchProJahr value for this BeschaeftigungszeitType.
     *
     * @return urlaubsanspruchProJahr   * Entweder urlaubsanpruchInDiesemZeitraum
     *                 				oder urlaubsanspruchProJahr darf ein
     *                 				Wert haben. Wenn beide Wert haben dann
     *                 				wird nur bei
     *                 				urlaubsanpruchInDiesemZeitraum
     *                 				gespeichert.
     */
    public Float getUrlaubsanspruchProJahr() {
        return urlaubsanspruchProJahr;
    }

    /**
     * Sets the urlaubsanspruchProJahr value for this BeschaeftigungszeitType.
     *
     * @param urlaubsanspruchProJahr   * Entweder urlaubsanpruchInDiesemZeitraum
     *                 				oder urlaubsanspruchProJahr darf ein
     *                 				Wert haben. Wenn beide Wert haben dann
     *                 				wird nur bei
     *                 				urlaubsanpruchInDiesemZeitraum
     *                 				gespeichert.
     */
    public void setUrlaubsanspruchProJahr(Float urlaubsanspruchProJahr) {
        this.urlaubsanspruchProJahr = urlaubsanspruchProJahr;
    }

    /**
     * Gets the fehltagInStunden value for this BeschaeftigungszeitType.
     *
     * @return fehltagInStunden   * 0 = jeder Fehltag ist soviel Wert wie die regelarbeitszeit
     * an dem Tag,
     * eine Zahl = Der Wert des Fehltages wird anhand dieser Zahl berechnet.
     */
    public Float getFehltagInStunden() {
        return fehltagInStunden;
    }

    /**
     * Sets the fehltagInStunden value for this BeschaeftigungszeitType.
     *
     * @param fehltagInStunden   * 0 = jeder Fehltag ist soviel Wert wie die regelarbeitszeit
     * an dem Tag,
     * eine Zahl = Der Wert des Fehltages wird anhand dieser Zahl berechnet.
     */
    public void setFehltagInStunden(Float fehltagInStunden) {
        this.fehltagInStunden = fehltagInStunden;
    }

    /**
     * Gets the action value for this BeschaeftigungszeitType.
     *
     * @return action   * Die mit dem Beschäftigungszeitraum
     *                 				durchzuführende Aktion.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this BeschaeftigungszeitType.
     *
     * @param action   * Die mit dem Beschäftigungszeitraum
     *                 				durchzuführende Aktion.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BeschaeftigungszeitType)) return false;
        BeschaeftigungszeitType other = (BeschaeftigungszeitType) obj;
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
                ((this.userId == null && other.getUserId() == null) ||
                        (this.userId != null &&
                                this.userId.equals(other.getUserId()))) &&
                ((this.startdatum == null && other.getStartdatum() == null) ||
                        (this.startdatum != null &&
                                this.startdatum.equals(other.getStartdatum()))) &&
                ((this.enddatum == null && other.getEnddatum() == null) ||
                        (this.enddatum != null &&
                                this.enddatum.equals(other.getEnddatum()))) &&
                ((this.bemerkung == null && other.getBemerkung() == null) ||
                        (this.bemerkung != null &&
                                this.bemerkung.equals(other.getBemerkung()))) &&
                ((this.urlaubsanpruchInDiesemZeitraum == null && other.getUrlaubsanpruchInDiesemZeitraum() == null) ||
                        (this.urlaubsanpruchInDiesemZeitraum != null &&
                                this.urlaubsanpruchInDiesemZeitraum.equals(other.getUrlaubsanpruchInDiesemZeitraum()))) &&
                ((this.urlaubsanspruchProJahr == null && other.getUrlaubsanspruchProJahr() == null) ||
                        (this.urlaubsanspruchProJahr != null &&
                                this.urlaubsanspruchProJahr.equals(other.getUrlaubsanspruchProJahr()))) &&
                ((this.fehltagInStunden == null && other.getFehltagInStunden() == null) ||
                        (this.fehltagInStunden != null &&
                                this.fehltagInStunden.equals(other.getFehltagInStunden()))) &&
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
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getStartdatum() != null) {
            _hashCode += getStartdatum().hashCode();
        }
        if (getEnddatum() != null) {
            _hashCode += getEnddatum().hashCode();
        }
        if (getBemerkung() != null) {
            _hashCode += getBemerkung().hashCode();
        }
        if (getUrlaubsanpruchInDiesemZeitraum() != null) {
            _hashCode += getUrlaubsanpruchInDiesemZeitraum().hashCode();
        }
        if (getUrlaubsanspruchProJahr() != null) {
            _hashCode += getUrlaubsanspruchProJahr().hashCode();
        }
        if (getFehltagInStunden() != null) {
            _hashCode += getFehltagInStunden().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
