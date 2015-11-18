/**
 * The FndMngHolder entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndMngHolder {
    static mapping = {
         table 'fnd_mng_holder'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'fnd_mng_seq', params:[sequence:'fnd_mng_holder_sequence']
         id generator:'identity', column:'FND_MNG_SEQ'
        endDate column: 'ENDDATE'
        fndMngName column: 'FND_MNG_NAME'
    }
    Long fndMngSeq
    Long version
    Date endDate
    Long fndMngCode
    String fndMngName
    Long holderCode
    String holderName
    Long holderRank
    String shrPct

    static constraints = {
        fndMngSeq(max: 9999999999L)
        version(max: 9223372036854775807L)
        endDate(nullable: true)
        fndMngCode(max: 9999999999L)
        fndMngName(size: 1..200, blank: false)
        holderCode(max: 9999999999L)
        holderName(size: 1..200, blank: false)
        holderRank(max: 9999999999L)
        shrPct(size: 0..5)
    }
    String toString() {
        return "${fndMngSeq}" 
    }
}
