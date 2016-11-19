package week2.lazyEvaluation

object test {
  val problem = new Pouring(Vector(4,7,19))       //> problem  : week2.lazyEvaluation.Pouring = week2.lazyEvaluation.Pouring@90f6bf
                                                  //| d
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with w
                                                  //| eek2.lazyEvaluation.test.problem.Move] = Vector(Empty(0), Empty(1), Empty(2)
                                                  //| , Fill(0), Fill(1), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pou
                                                  //| r(2,0), Pour(2,1))
  
  problem.pathSets.take(3).toList                 //> res1: List[Set[week2.lazyEvaluation.test.problem.Path]] = List(Set(--> Vecto
                                                  //| r(0, 0, 0)), Set(Fill(0)--> Vector(4, 0, 0), Fill(1)--> Vector(0, 7, 0), Fil
                                                  //| l(2)--> Vector(0, 0, 19)), Set(Fill(1) Pour(1,2)--> Vector(0, 0, 7), Fill(2)
                                                  //|  Fill(1)--> Vector(0, 7, 19), Fill(1) Fill(0)--> Vector(4, 7, 0), Fill(0) Fi
                                                  //| ll(1)--> Vector(4, 7, 0), Fill(2) Pour(2,1)--> Vector(0, 7, 12), Fill(2) Pou
                                                  //| r(2,0)--> Vector(4, 0, 15), Fill(2) Fill(0)--> Vector(4, 0, 19), Fill(0) Fil
                                                  //| l(2)--> Vector(4, 0, 19), Fill(1) Pour(1,0)--> Vector(4, 3, 0), Fill(0) Pour
                                                  //| (0,2)--> Vector(0, 0, 4), Fill(0) Pour(0,1)--> Vector(0, 4, 0), Fill(1) Fill
                                                  //| (2)--> Vector(0, 7, 19)))
   problem.solutions(16)                          //> res2: Stream[week2.lazyEvaluation.test.problem.Path] = Stream(Fill(2) Fill(0
                                                  //| ) Pour(0,1) Pour(2,1)--> Vector(0, 7, 16), ?)
}