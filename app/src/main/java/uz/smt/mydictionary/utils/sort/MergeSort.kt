package uz.smt.mydictionary.utils.sort

/**
 *  This file is created by Saidmurod Turdiyev SMT for My Dictionary app
 *  7/25/2024  9:04 PM  Asus Rog
 */
fun mergeSort(nums: IntArray): IntArray {
    val start=0
    val end=nums.size-1
    mergeSort(nums,start,end)
    return nums
}
private fun mergeSort(nums:IntArray,start:Int,end:Int){
    if(nums.size<2||(end-start)<1){
        return
    }
    if(nums.size==2||(end-start)==1){
        if(nums[start]>nums[end]){
            val t=nums[start]
            nums[start]=nums[end]
            nums[end]=t
        }
        return
    }
    val half:Int=(start+end+1)/2

    mergeSort(nums,half,end)
    mergeSort(nums,start,half-1)
    var i=start
    var j=0
    var k=0
    val arrS=Array(half-start){
        nums[it+i]
    }
    val arrE=Array(end-half+1){
        nums[half+it]
    }
    var endS=false
    var endE=false
    while(i<=end){
        if(endS){
            nums[i]=arrE[k]
            k++
        } else if(endE){
            nums[i]=arrS[j]
            j++
        }else if(arrS[j]<arrE[k]){
            nums[i]=arrS[j]
            j++
            endS=arrS.size<=j
        }else{
            nums[i]=arrE[k]
            k++
            endE=arrE.size<=k
        }
        i++
    }
}