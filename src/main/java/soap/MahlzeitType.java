/**
 * MahlzeitType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Struktur zur Anlage von Mahlzeiten an einem Tag.
 */
public class MahlzeitType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MahlzeitType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "MahlzeitType"));
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
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("breakfast");
        elemField.setXmlName(new javax.xml.namespace.QName("", "breakfast"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lunch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lunch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dinner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dinner"));
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

    private Integer id;
    /* Die Userid des Benutzers. */
    private String userId;
    /* Das Datum, an dem der Mahlzeiten-Eintrag angelegt werden soll. */
    private String datum;
    /* Boolean Flagge, ob an dem Tag ein Frühstück stattfand (0/1). */
    private Integer breakfast;
    /* Boolean Flagge, ob an dem Tag ein Mittagessen stattfand (0/1). */
    private Integer lunch;
    /* Boolean Flagge, ob an dem Tag ein Abendessen stattfand (0/1). */
    private Integer dinner;
    private String action;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public MahlzeitType() {
    }


    public MahlzeitType(
            Integer id,
            String userId,
            String datum,
            Integer breakfast,
            Integer lunch,
            Integer dinner,
            String action) {
        this.id = id;
        this.userId = userId;
        this.datum = datum;
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
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
     * Gets the id value for this MahlzeitType.
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id value for this MahlzeitType.
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the userId value for this MahlzeitType.
     *
     * @return userId   * Die Userid des Benutzers.
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId value for this MahlzeitType.
     *
     * @param userId   * Die Userid des Benutzers.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the datum value for this MahlzeitType.
     *
     * @return datum   * Das Datum, an dem der Mahlzeiten-Eintrag angelegt werden soll.
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this MahlzeitType.
     *
     * @param datum   * Das Datum, an dem der Mahlzeiten-Eintrag angelegt werden soll.
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the breakfast value for this MahlzeitType.
     *
     * @return breakfast   * Boolean Flagge, ob an dem Tag ein Frühstück stattfand (0/1).
     */
    public Integer getBreakfast() {
        return breakfast;
    }

    /**
     * Sets the breakfast value for this MahlzeitType.
     *
     * @param breakfast   * Boolean Flagge, ob an dem Tag ein Frühstück stattfand (0/1).
     */
    public void setBreakfast(Integer breakfast) {
        this.breakfast = breakfast;
    }

    /**
     * Gets the lunch value for this MahlzeitType.
     *
     * @return lunch   * Boolean Flagge, ob an dem Tag ein Mittagessen stattfand (0/1).
     */
    public Integer getLunch() {
        return lunch;
    }

    /**
     * Sets the lunch value for this MahlzeitType.
     *
     * @param lunch   * Boolean Flagge, ob an dem Tag ein Mittagessen stattfand (0/1).
     */
    public void setLunch(Integer lunch) {
        this.lunch = lunch;
    }

    /**
     * Gets the dinner value for this MahlzeitType.
     *
     * @return dinner   * Boolean Flagge, ob an dem Tag ein Abendessen stattfand (0/1).
     */
    public Integer getDinner() {
        return dinner;
    }

    /**
     * Sets the dinner value for this MahlzeitType.
     *
     * @param dinner   * Boolean Flagge, ob an dem Tag ein Abendessen stattfand (0/1).
     */
    public void setDinner(Integer dinner) {
        this.dinner = dinner;
    }

    /**
     * Gets the action value for this MahlzeitType.
     *
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the action value for this MahlzeitType.
     *
     * @param action
     */
    public void setAction(String action) {
        this.action = action;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MahlzeitType)) return false;
        MahlzeitType other = (MahlzeitType) obj;
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
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.breakfast == null && other.getBreakfast() == null) ||
                        (this.breakfast != null &&
                                this.breakfast.equals(other.getBreakfast()))) &&
                ((this.lunch == null && other.getLunch() == null) ||
                        (this.lunch != null &&
                                this.lunch.equals(other.getLunch()))) &&
                ((this.dinner == null && other.getDinner() == null) ||
                        (this.dinner != null &&
                                this.dinner.equals(other.getDinner()))) &&
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
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getBreakfast() != null) {
            _hashCode += getBreakfast().hashCode();
        }
        if (getLunch() != null) {
            _hashCode += getLunch().hashCode();
        }
        if (getDinner() != null) {
            _hashCode += getDinner().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

}
