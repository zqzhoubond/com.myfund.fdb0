/**
 * The PubInduRef entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class PubInduRef {
    static mapping = {
         table 'pub_indu_ref'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'pub_indu_ref_sequence']
         id generator:'identity', column:'INNER_CODE'
    }
    Long innerCode
    Date ctime
    String definition
    Long geniusUid
    String induCode
    Long induLevel
    String induName
    Long induSysMark
    String induSysName
    java.math.BigDecimal isvalid
    Date mtime
//    Long parentCode
    String sector
    Long seq

    static constraints = {
        innerCode()
        ctime(nullable: true)
        definition(size: 1..400, blank: false)
        geniusUid(nullable: true, max: 9223372036854775807L)
        induCode(size: 1..12, blank: false)
        induLevel(nullable: true, max: 9223372036854775807L)
        induName(size: 1..60, blank: false)
        induSysMark(nullable: true, max: 9223372036854775807L)
        induSysName(size: 1..50, blank: false)
        isvalid(nullable: true)
        mtime(nullable: true)
//        parentCode(nullable: true, max: 9223372036854775807L)
        sector(size: 1..1, blank: false)
        seq(nullable: true, max: 9223372036854775807L)
    }
    String toString() {
        return "${innerCode}" 
    }
}
