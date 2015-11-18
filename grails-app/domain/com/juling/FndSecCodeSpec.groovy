/**
 * The FndSecCodeSpec entity.
 *
 * @author    
 *
 *
 */
package  com.juling
class FndSecCodeSpec {
    static mapping = {
         table 'fnd_sec_code_spec'
         // version is set to false, because this isn't available by default for legacy databases
         version false
         // In case a sequence is needed, changed the identity generator for the following code:
//       id generator:'sequence', column:'inner_code', params:[sequence:'fnd_sec_code_spec_sequence']
         id generator:'identity', column:'INNER_CODE'
    }
    Long innerCode
    Long seq
    Date ctime
    Date mtime
    Date listDate
    Date listEnddate
    Long secType
    Long mktType
    Long listStatus
    Long comcode
    java.math.BigDecimal isvalid
    Long geniusUid
    String isin
    String secCode
    String secName
    String secSname

    static constraints = {
        innerCode(max: 9999999999L)
        seq(max: 9999999999L)
        ctime()
        mtime()
        listDate(nullable: true)
        listEnddate(nullable: true)
        secType(nullable: true, max: 9999999999L)
        mktType(nullable: true, max: 9999999999L)
        listStatus(nullable: true, max: 9999999999L)
        comcode(nullable: true, max: 9999999999L)
        isvalid()
        geniusUid(max: 9223372036854775807L)
        isin(size: 0..12)
        secCode(size: 0..30)
        secName(size: 0..200)
        secSname(size: 0..100)
    }
    String toString() {
        return "${innerCode}" 
    }
}
