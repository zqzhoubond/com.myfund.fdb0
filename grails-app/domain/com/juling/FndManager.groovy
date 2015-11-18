/**
 * The FndManager entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndManager implements  Serializable{
    static mapping = {
         table 'fnd_manager'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'fund_id', params:[sequence:'fnd_manager_sequence']
         id generator:'identity', column:'FUND_ID'
         id column:'declaredate'
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'indi_id', params:[sequence:'fnd_manager_sequence']
         id generator:'identity', column:'INDI_ID'
         id composite:['fundId','declaredate','indiId'], generator:'assigned'
    }
    Long fundId
    Date declaredate
    Long indiId
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date postDate
    Long post
    String postMark
    Long postStatus
    String postStatusMark
    Date resiDate
    Long leaveRsn
    String leaveRsnMark
    String indiName

    static constraints = {
        fundId(max: 9999999999L)
        declaredate()
        indiId(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        postDate(nullable: true)
        post(nullable: true, max: 9999999999L)
        postMark(size: 0..30)
        postStatus(nullable: true, max: 9999999999L)
        postStatusMark(size: 0..20)
        resiDate(nullable: true)
        leaveRsn(nullable: true, max: 9999999999L)
        leaveRsnMark(size: 0..30)
        indiName(size: 0..30)
    }
    String toString() {
        return "${fundId}" 
    }
}
