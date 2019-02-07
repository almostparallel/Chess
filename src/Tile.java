public abstract class Tile {

    int tileCord;
    Tile(int tileCord){
        this.tileCord = tileCord;
    }
    public abstract boolean isTileOcupped();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile{
        EmptyTile(int coordinate){
            super(coordinate);
        }

        @Override
        public boolean isTileOcupped(){
            return false;
        }
        @Override
        public Piece getPiece(){
            return null;
        }
    }
}