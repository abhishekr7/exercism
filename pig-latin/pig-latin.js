//
// This is only a SKELETON file for the 'Pig Latin' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class translator {

  static translate(phrase) {
    //throw new Error("Remove this statement and implement this function");

    var direct_vowel_sounds = ['a','e','i','o','u'];
    var indirect_vowel_sounds = ['y'];

    var word_array = phrase.split(' ');
    var array_length = word_array.length;

    var new_word_array = []

    for (var itr = 0; itr < array_length; itr ++) {
        var word = word_array[itr];

        for ( var index = 0 ; index < word.length ; index ++){

            if(direct_vowel_sounds.indexOf(word[index]) !== -1)
              break;

            if(indirect_vowel_sounds.indexOf(word[index]) !== -1 && index > 0)
              break;

            if(word.slice(index,index+2) === 'xr' || word.slice(index,index+2) === 'yt')
              break;

            if(word.slice(index,index+2) === 'qu')
              index = index + 1;

        }

        var new_word = word.slice(index) + word.slice(0, index) + 'ay';

        new_word_array.push(new_word);
    }

    return new_word_array.join(' ');

    //return word;
  }
}
