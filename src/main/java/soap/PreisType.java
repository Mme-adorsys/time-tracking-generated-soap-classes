/**
 * PreisType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Preises.
 */
public class PreisType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(PreisType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "PreisType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preisgruppe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preisgruppe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagessatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagessatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stundensatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stundensatz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speziellStundensatz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "speziellStundensatz"));
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

    /* Die Id des Preises. Pflicht bei Update und Löschen. */
    private Integer id;
    /* Die Preisgruppe, der der Preis zugeordnet ist. Pflicht bei
     * Anlage. */
    private String preisgruppe;
    /* Der Tagessatz. */
    private Double tagessatz;
    /* Der Stundensatz. */
    private Double stundensatz;
    /* Ein spezieller Stundensatz für die im Preis angegebene Tätigkeit. */
    private Double speziellStundensatz;
    /* Die Tätigkeit, für die ein spezieller Stundensatz gilt. */
    private String taetigkeit;
    /* Aktion. Um den Preis im Rahmen eines Updates zu löschen muss
     * hier "delete" angegeben werden. */
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public PreisType() {
    }


    public PreisType(
            Integer id,
            String preisgruppe,
            Double tagessatz,
            Double stundensatz,
            Double speziellStundensatz,
            String taetigkeit,
            String action) {
        this.id = id;
        this.preisgruppe = preisgruppe;
        this.tagessatz = tagessatz;
        this.stundensatz = stundensatz;
        this.speziellStundensatz = speziellStundensatz;
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
     * Gets the id value for this PreisType.
     *
     * @return id   * Die Id des Preises. Pflicht bei Update und Löschen.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this PreisType.
     *
     * @param id   * Die Id des Preises. Pflicht bei Update und Löschen.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the preisgruppe value for this PreisType.
     *
     * @return preisgruppe   * Die Preisgruppe, der der Preis zugeordnet ist. Pflicht bei
     * Anlage.
     */
    public String getPreisgruppe() {
        return preisgruppe;
    }

    /**
     * Sets the preisgruppe value for this PreisType.
     *
     * @param preisgruppe   * Die Preisgruppe, der der Preis zugeordnet ist. Pflicht bei
     * Anlage.
     */
    public void setPreisgruppe(String preisgruppe) {
        this.preisgruppe = preisgruppe;
    }

    /**
     * Gets the tagessatz value for this PreisType.
     *
     * @return tagessatz   * Der Tagessatz.
     */
    public Double getTagessatz() {
        return tagessatz;
    }

    /**
     * Sets the tagessatz value for this PreisType.
     *
     * @param tagessatz   * Der Tagessatz.
     */
    public void setTagessatz(Double tagessatz) {
        this.tagessatz = tagessatz;
    }

    /**
     * Gets the stundensatz value for this PreisType.
     *
     * @return stundensatz   * Der Stundensatz.
     */
    public Double getStundensatz() {
        return stundensatz;
    }

    /**
     * Sets the stundensatz value for this PreisType.
     *
     * @param stundensatz   * Der Stundensatz.
     */
    public void setStundensatz(Double stundensatz) {
        this.stundensatz = stundensatz;
    }

    /**
     * Gets the speziellStundensatz value for this PreisType.
     *
     * @return speziellStundensatz   * Ein spezieller Stundensatz für die im Preis angegebene Tätigkeit.
     */
    public Double getSpeziellStundensatz() {
        return speziellStundensatz;
    }

    /**
     * Sets the speziellStundensatz value for this PreisType.
     *
     * @param speziellStundensatz   * Ein spezieller Stundensatz für die im Preis angegebene Tätigkeit.
     */
    public void setSpeziellStundensatz(Double speziellStundensatz) {
        this.speziellStundensatz = speziellStundensatz;
    }

    /**
     * Gets the taetigkeit value for this PreisType.
     *
     * @return taetigkeit   * Die Tätigkeit, für die ein spezieller Stundensatz gilt.
     */
    public String getTaetigkeit() {
        return taetigkeit;
    }

    /**
     * Sets the taetigkeit value for this PreisType.
     *
     * @param taetigkeit   * Die Tätigkeit, für die ein spezieller Stundensatz gilt.
     */
    public void setTaetigkeit(String taetigkeit) {
        this.taetigkeit = taetigkeit;
    }

    /**
     * Gets the action value for this PreisType.
     *
     * @return action   * Aktion. Um den Preis im Rahmen eines Updates zu löschen muss
     * hier "delete" angegeben werden.
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this PreisType.
     *
     * @param action   * Aktion. Um den Preis im Rahmen eines Updates zu löschen muss
     * hier "delete" angegeben werden.
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreisType)) return false;
        PreisType other = (PreisType) obj;
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
                ((this.preisgruppe == null && other.getPreisgruppe() == null) ||
                        (this.preisgruppe != null &&
                                this.preisgruppe.equals(other.getPreisgruppe()))) &&
                ((this.tagessatz == null && other.getTagessatz() == null) ||
                        (this.tagessatz != null &&
                                this.tagessatz.equals(other.getTagessatz()))) &&
                ((this.stundensatz == null && other.getStundensatz() == null) ||
                        (this.stundensatz != null &&
                                this.stundensatz.equals(other.getStundensatz()))) &&
                ((this.speziellStundensatz == null && other.getSpeziellStundensatz() == null) ||
                        (this.speziellStundensatz != null &&
                                this.speziellStundensatz.equals(other.getSpeziellStundensatz()))) &&
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
        if (getPreisgruppe() != null) {
            _hashCode += getPreisgruppe().hashCode();
        }
        if (getTagessatz() != null) {
            _hashCode += getTagessatz().hashCode();
        }
        if (getStundensatz() != null) {
            _hashCode += getStundensatz().hashCode();
        }
        if (getSpeziellStundensatz() != null) {
            _hashCode += getSpeziellStundensatz().hashCode();
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
