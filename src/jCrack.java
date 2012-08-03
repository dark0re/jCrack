/*  This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

public class jCrack{
	public static void main(String[] args) {
		
		//check for args
		if( (args.length<=2) || (args.length>3) ) {
			jcHelper.usage();
		}
		
		//initialize
		String wordlist=args[0];
		String hashfile=args[1];
		String hashtype=args[2];

		//check hashtype and run appropriate class
		if(hashtype.equals("smb")){
			System.exit(0);
		}else if(hashtype.equals("sha512")){
			crackSHA512.run(wordlist,hashfile);
		}else if(hashtype.equals("sha256")){
			crackSHA256.run(wordlist,hashfile);
		}else if(hashtype.equals("md5")){
			System.exit(0);
		}else {
			jcHelper.usage();
		}
						
		
	}
}
