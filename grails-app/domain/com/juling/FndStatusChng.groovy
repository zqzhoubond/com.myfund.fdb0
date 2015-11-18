/**
 * The FndStatusChng entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndStatusChng implements  Serializable{
    static mapping = {
         table 'fnd_status_chng'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_status_chng_sequence']
         id generator:'identity', column:'INNER_CODE'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'event_type', params:[sequence:'fnd_status_chng_sequence']
         id generator:'identity', column:'EVENT_TYPE'
         id column:'change_date'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'charge_mode', params:[sequence:'fnd_status_chng_sequence']
         id generator:'identity', column:'CHARGE_MODE'
         id composite:['innerCode','eventType','changeDate','chargeMode'], generator:'assigned'
    }
    Long innerCode
    Long eventType
    Date changeDate
    Long chargeMode
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate
    String eventTypeMark
    Long chngType
    String chngTypeMark
    String chargeModeMark
    String remark
    java.math.BigDecimal valLimit
    Date enddate

    static constraints = {
        innerCode(max: 9999999999L)
        eventType(max: 9999999999L)
        changeDate()
        chargeMode(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        declaredate(nullable: true)
        eventTypeMark(size: 0..30)
        chngType(nullable: true, max: 9999999999L)
        chngTypeMark(size: 0..30)
        chargeModeMark(size: 0..30)
        remark()
        valLimit(nullable: true)
        enddate(nullable: true)
    }
    String toString() {
        return "${innerCode}" 
    }
}
