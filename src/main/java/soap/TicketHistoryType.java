/**
 * TicketHistoryType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package soap;


/**
 * Die Daten eines Historieneintrags zu einem Ticket.
 */
public class TicketHistoryType implements java.io.Serializable {
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(TicketHistoryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketHistoryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bearbeiter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bearbeiter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aenderungsListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aenderungsListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "TicketAenderungType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "aenderung"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anhangListe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anhangListe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://zep.provantis.de", "AnhangType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "anhang"));
        typeDesc.addFieldDesc(elemField);
    }

    /* Der Bearbeiter des Tickets. */
    private String bearbeiter;
    /* Das Datum des Eintrags. */
    private String datum;
    /* Kennung, ob es sich um eine interne Bemerkung handelt. */
    private Boolean intern;
    /* Eine optionale Liste von Änderungen. */
    private TicketAenderungType[] aenderungsListe;
    /* Eine optionale Liste von Anhängen. */
    private AnhangType[] anhangListe;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;


    public TicketHistoryType() {
    }


    public TicketHistoryType(
            String bearbeiter,
            String datum,
            Boolean intern,
            TicketAenderungType[] aenderungsListe,
            AnhangType[] anhangListe) {
        this.bearbeiter = bearbeiter;
        this.datum = datum;
        this.intern = intern;
        this.aenderungsListe = aenderungsListe;
        this.anhangListe = anhangListe;
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
     * Gets the bearbeiter value for this TicketHistoryType.
     *
     * @return bearbeiter   * Der Bearbeiter des Tickets.
     */
    public String getBearbeiter() {
        return bearbeiter;
    }

    /**
     * Sets the bearbeiter value for this TicketHistoryType.
     *
     * @param bearbeiter   * Der Bearbeiter des Tickets.
     */
    public void setBearbeiter(String bearbeiter) {
        this.bearbeiter = bearbeiter;
    }

    /**
     * Gets the datum value for this TicketHistoryType.
     *
     * @return datum   * Das Datum des Eintrags.
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the datum value for this TicketHistoryType.
     *
     * @param datum   * Das Datum des Eintrags.
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Gets the intern value for this TicketHistoryType.
     *
     * @return intern   * Kennung, ob es sich um eine interne Bemerkung handelt.
     */
    public Boolean getIntern() {
        return intern;
    }

    /**
     * Sets the intern value for this TicketHistoryType.
     *
     * @param intern   * Kennung, ob es sich um eine interne Bemerkung handelt.
     */
    public void setIntern(Boolean intern) {
        this.intern = intern;
    }

    /**
     * Gets the aenderungsListe value for this TicketHistoryType.
     *
     * @return aenderungsListe   * Eine optionale Liste von Änderungen.
     */
    public TicketAenderungType[] getAenderungsListe() {
        return aenderungsListe;
    }

    /**
     * Sets the aenderungsListe value for this TicketHistoryType.
     *
     * @param aenderungsListe   * Eine optionale Liste von Änderungen.
     */
    public void setAenderungsListe(TicketAenderungType[] aenderungsListe) {
        this.aenderungsListe = aenderungsListe;
    }

    /**
     * Gets the anhangListe value for this TicketHistoryType.
     *
     * @return anhangListe   * Eine optionale Liste von Anhängen.
     */
    public AnhangType[] getAnhangListe() {
        return anhangListe;
    }

    /**
     * Sets the anhangListe value for this TicketHistoryType.
     *
     * @param anhangListe   * Eine optionale Liste von Anhängen.
     */
    public void setAnhangListe(AnhangType[] anhangListe) {
        this.anhangListe = anhangListe;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TicketHistoryType)) return false;
        TicketHistoryType other = (TicketHistoryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.bearbeiter == null && other.getBearbeiter() == null) ||
                        (this.bearbeiter != null &&
                                this.bearbeiter.equals(other.getBearbeiter()))) &&
                ((this.datum == null && other.getDatum() == null) ||
                        (this.datum != null &&
                                this.datum.equals(other.getDatum()))) &&
                ((this.intern == null && other.getIntern() == null) ||
                        (this.intern != null &&
                                this.intern.equals(other.getIntern()))) &&
                ((this.aenderungsListe == null && other.getAenderungsListe() == null) ||
                        (this.aenderungsListe != null &&
                                java.util.Arrays.equals(this.aenderungsListe, other.getAenderungsListe()))) &&
                ((this.anhangListe == null && other.getAnhangListe() == null) ||
                        (this.anhangListe != null &&
                                java.util.Arrays.equals(this.anhangListe, other.getAnhangListe())));
        __equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBearbeiter() != null) {
            _hashCode += getBearbeiter().hashCode();
        }
        if (getDatum() != null) {
            _hashCode += getDatum().hashCode();
        }
        if (getIntern() != null) {
            _hashCode += getIntern().hashCode();
        }
        if (getAenderungsListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAenderungsListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAenderungsListe(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAnhangListe() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAnhangListe());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAnhangListe(), i);
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
