package com.jcmsalves.navarchcomponentssample

import android.os.Parcel
import android.os.Parcelable

data class SomeDataClass(val someField: String, val anotherField: Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(someField)
        parcel.writeInt(anotherField)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<SomeDataClass> {
        override fun createFromParcel(parcel: Parcel): SomeDataClass {
            return SomeDataClass(parcel)
        }

        override fun newArray(size: Int): Array<SomeDataClass?> {
            return arrayOfNulls(size)
        }
    }
}
