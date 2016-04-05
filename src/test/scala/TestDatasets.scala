import org.junit.Assert._
import org.junit.Test
import latis.reader.tsml.TsmlReader
import latis.writer.AsciiWriter
import latis.writer.JsonWriter
import latis.writer.Writer
import latis.ops.filter.Selection
import org.junit.Ignore
import latis.ops.Projection
import latis.ops.Operation
import latis.ops.TimeFormatter
import java.sql._
import latis.ops.filter._
import latis.dm._
import scala.collection.mutable.ArrayBuilder
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.TreeMap
import latis.time.Time
import latis.reader.DatasetAccessor
import java.io.File
import latis.ops.agg.LeftOuterJoin
import scala.concurrent.Await

class TestDatasets {
  
  @Test
  def sstoi_indices = {
    val ops = ArrayBuffer[Operation]()
    ops += Selection("time>=2016-01-01")
    ops += TimeFormatter("yyyy-MM-dd")
    val ds = DatasetAccessor.fromName("sstoi_indices.tsml").getDataset(ops)
    AsciiWriter.write(ds)
  }
  
}
