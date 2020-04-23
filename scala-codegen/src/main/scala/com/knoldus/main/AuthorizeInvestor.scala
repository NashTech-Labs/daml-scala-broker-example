/*
 * THIS FILE WAS AUTOGENERATED BY THE DIGITAL ASSET DAML SCALA CODE GENERATOR
 * DO NOT EDIT BY HAND!
 */
import _root_.com.digitalasset.ledger.client.{binding=>$u0020lfdomainapi}
import _root_.com.digitalasset.ledger.api.v1.{value=>$u0020rpcvalue}
package com.knoldus {
  package Main {
    final case class AuthorizeInvestor(investor: ` lfdomainapi`.Primitive.Party, updated_Token: ` lfdomainapi`.Primitive.Int64) extends ` lfdomainapi`.ValueRef

    object AuthorizeInvestor extends ` lfdomainapi`.ValueRefCompanion with _root_.scala.Function2[` lfdomainapi`.Primitive.Party, ` lfdomainapi`.Primitive.Int64, _root_.com.knoldus.Main.AuthorizeInvestor] {
      import _root_.scala.language.higherKinds;
      trait view[` C`[_]] extends ` lfdomainapi`.encoding.RecordView[` C`, view] { $u0020view =>
        val investor: ` C`[` lfdomainapi`.Primitive.Party];
        val updated_Token: ` C`[` lfdomainapi`.Primitive.Int64];
        final override def hoist[` D`[_]](` f` : _root_.scalaz.~>[` C`, ` D`]): view[` D`] = {
          final class $anon extends _root_.scala.AnyRef with view[` D`] {
            override val investor = ` f`(` view`.investor);
            override val updated_Token = ` f`(` view`.updated_Token)
          };
          new $anon()
        }
      };
      implicit val `AuthorizeInvestor Value`: ` lfdomainapi`.Value[_root_.com.knoldus.Main.AuthorizeInvestor] = {
        final class $anon extends this.`Value ValueRef`[_root_.com.knoldus.Main.AuthorizeInvestor] {
          override def write(value: _root_.com.knoldus.Main.AuthorizeInvestor): ` rpcvalue`.Value.Sum = ` record`(scala.Tuple2("investor", ` lfdomainapi`.Value.encode(value.investor)), scala.Tuple2("updated_Token", ` lfdomainapi`.Value.encode(value.updated_Token)));
          override def read(argValue: ` rpcvalue`.Value.Sum): _root_.scala.Option[_root_.com.knoldus.Main.AuthorizeInvestor] = argValue.record.flatMap(((` r` ) => if (` r`.fields.length.==(2))
            ` r`.fields(0) match {
              case ` rpcvalue`.RecordField((""| "investor"), _root_.scala.Some(zv0)) => (` lfdomainapi`.Value.decode[` lfdomainapi`.Primitive.Party](zv0) match {
                case _root_.scala.Some(investor) => (` r`.fields(1) match {
                  case ` rpcvalue`.RecordField((""| "updated_Token"), _root_.scala.Some(zv1)) => (` lfdomainapi`.Value.decode[` lfdomainapi`.Primitive.Int64](zv1) match {
                    case _root_.scala.Some(updated_Token) => Some(AuthorizeInvestor(investor, updated_Token))
                    case _root_.scala.None => _root_.scala.None
                  })
                  case _ => _root_.scala.None
                })
                case _root_.scala.None => _root_.scala.None
              })
              case _ => _root_.scala.None
            }
          else
            _root_.scala.None))
        };
        new $anon()
      };
      override protected val ` dataTypeId` = ` mkDataTypeId`(`Package IDs`.Main, "Main", "AuthorizeInvestor");
      implicit def `AuthorizeInvestor LfEncodable`: ` lfdomainapi`.encoding.LfEncodable[_root_.com.knoldus.Main.AuthorizeInvestor] = {
        final class $anon extends ` lfdomainapi`.encoding.LfEncodable[_root_.com.knoldus.Main.AuthorizeInvestor] {
          override def encoding(lte: ` lfdomainapi`.encoding.LfTypeEncoding): lte.Out[_root_.com.knoldus.Main.AuthorizeInvestor] = {
            object `view ` extends view[lte.Field] {
              val investor = lte.field("investor", ` lfdomainapi`.encoding.LfEncodable.encoding[` lfdomainapi`.Primitive.Party](lte));
              val updated_Token = lte.field("updated_Token", ` lfdomainapi`.encoding.LfEncodable.encoding[` lfdomainapi`.Primitive.Int64](lte))
            };
            {
              val `recordFields `: lte.RecordFields[_root_.com.knoldus.Main.AuthorizeInvestor] = lte.RecordFields.xmapN(lte.fields(`view `.investor), lte.fields(`view `.updated_Token))({
                case scala.Tuple2(investor, updated_Token) => _root_.com.knoldus.Main.AuthorizeInvestor(investor, updated_Token)
              })({
                case _root_.com.knoldus.Main.AuthorizeInvestor(investor, updated_Token) => scala.Tuple2(investor, updated_Token)
              });
              lte.record(` dataTypeId`, `recordFields `)
            }
          }
        };
        new $anon()
      }
    }
  }
}
