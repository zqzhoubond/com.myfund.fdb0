/**
 * The FndIndiInfo entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndIndiInfo {
    static mapping = {
         table 'fnd_indi_info'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'indi_id', params:[sequence:'fnd_indi_info_sequence']
         id generator:'identity', column:'INDI_ID'
    }
    Long indiId
    Long seq
    Date ctime
    Date mtime
    java.math.BigDecimal isvalid
    Long geniusUid
    Date declaredate
    String name
    String pastName
    Long birthyear
    Long gender
    String genderMark
    Long poli
    String poliMark
    String college
    Long edu
    String eduMark
    String ctf
    String ctfMark
    Long expeNumYear
    String resume
    Long nation
    String nationMark

    static constraints = {
        indiId(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        isvalid()
        geniusUid(max: 9223372036854775807L)
        declaredate(nullable: true)
        name(size: 0..60)
        pastName(size: 0..60)
        birthyear(nullable: true, max: 9999999999L)
        gender(nullable: true, max: 9999999999L)
        genderMark(size: 0..16)
        poli(nullable: true, max: 9999999999L)
        poliMark(size: 0..60)
        college(size: 0..200)
        edu(nullable: true, max: 9999999999L)
        eduMark(size: 0..40)
        ctf(size: 0..100)
        ctfMark(size: 0..200)
        expeNumYear(nullable: true, max: 9999999999L)
        resume()
        nation(nullable: true, max: 9999999999L)
        nationMark(size: 0..100)
    }
    String toString() {
        return "${indiId}" 
    }
}
